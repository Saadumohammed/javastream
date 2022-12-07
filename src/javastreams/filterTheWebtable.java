package javastreams;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filterTheWebtable {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> webElementList = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> collect = webElementList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
	    Assert.assertEquals(webElementList.size(), collect.size());
	    System.out.println(webElementList.size());
	    System.out.println(collect.size());
}





}