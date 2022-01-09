package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("Selenium");
		s.add("Boll");
		s.add("Cycle");
		s.add("Apple");
		s.add("Boll");
//		s.remove("Cycle");
//		s.clear();
		
//		Iterator<String> it = s.iterator();
//		
//		while(it.hasNext())
//		{
//			String data = it.next();
//			System.out.println(data);
//		}
			
		for(String data: s)
		{
			System.out.println(data);
		}

	}

}
