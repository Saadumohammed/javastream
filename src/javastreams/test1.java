package javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	//@Test
	public void Regular() 
	{
	ArrayList<String> names	= new ArrayList<String>();
	names.add("Mohsin");
	names.add("thaseen");
	names.add("Abbas");
	names.add("Shujath");
	names.add("Ahmed");
	names.add("Mohammed");
	int count = 0;
	for (int i =0; i<names.size();i++) 
	{
		String actual = names.get(i);
		if(actual.startsWith("A")) 
		
		{
			count++;
			
		}
		System.out.println(count);
	}
	}
	@Test
	public void streamFilter() 
	{
	ArrayList<String> names	= new ArrayList<String>();
	names.add("Mohsin");
	names.add("thaseen");
	names.add("Abbas");
	names.add("Shujath");
	names.add("Ahm");
	names.add("Mohammed");
	
	//Long c = names.stream().filter(s->s.startsWith("A")).count();
	//System.out.println(c);
	//for (String nm : names) {
		//if(nm.length()<=3) {
		//	System.out.println(nm);
	
	//length more than 3 its printable with for each loop
	names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
	
	
		}
	
	//@Test
	public void streamMap() 
	{
		ArrayList<String> names	= new ArrayList<String>();
		names.add("Aabid");
		names.add("abraham");
		names.add("Mani");
		names.add("Zakir");
		names.add("John");
		names.add("Mohammed");
		
		//Stream.of("Kashif","Rajesh","Murugan","Kantish","Mohan").filter(s->s.endsWith("n")).map(s->s.toUpperCase())
		//.forEach(s->System.out.println(s));
   		 
		//Print names as which have as a with uppercase and sorted 
	//	List <String> names1 = Arrays.asList("Ashif","Rajesh","Murugan","Kantish","Mohan");
			//names1.stream().filter(s->s.startsWith("K")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		// Merging two different lists	
		 // Stream <String> allValues = Stream.concat(names.stream(), names1.stream());
	//		allValues.sorted().forEach(s->System.out.println(s));
			
			//want to check specific data which is available or not using boolean method
			// boolean flag = allValues.anyMatch(s->s.equalsIgnoreCase("Mani"));
		// 	Assert.assertTrue(flag);
			
		
			
			
	}
	
	//@Test
	
	public void streamCollect()
	{
		List <String> st  = Stream.of("Kashif","Rajesh","Murugan","Kantish","Mohan").filter(s->s.startsWith("K")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(st.get(0));
		
	}
	
		
	}


	
	
		
		
	