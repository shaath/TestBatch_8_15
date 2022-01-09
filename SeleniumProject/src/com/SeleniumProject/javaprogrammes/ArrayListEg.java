package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		
		List<String> courses = new ArrayList<String>();
		
		courses.add("Selenium");
		courses.add("Apple");
		courses.add("Boll");
		courses.add("UFT");
		courses.add("Apple");
		courses.add(2, "Cycle");
//		courses.remove(2);
//		courses.clear();
		
		System.out.println(courses.size());
		
//		System.out.println(courses.get(2));
		
		for (int i = 0; i < courses.size(); i++) 
		{
			System.out.println(courses.get(i));	
		}
		
	}

}
