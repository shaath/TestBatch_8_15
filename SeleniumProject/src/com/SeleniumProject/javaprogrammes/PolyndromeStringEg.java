package com.SeleniumProject.javaprogrammes;

public class PolyndromeStringEg {

	public static void main(String[] args) {
		
		String course = "Malayalam"; 
		String rev = "";
		
		int len = course.length();
//		System.out.println(len);
		
		for(int i = len-1 ; i >= 0; i--)
		{
//			System.out.print(course.charAt(i));
			rev = rev + course.charAt(i);			
		}
		
		System.out.println(rev);
		
		if (course.equalsIgnoreCase(rev)) 
		{
			System.out.println("Given String is polyndrome");
		}
		else
		{
			System.out.println("Given String is not a polyndrome");
		}

	}

}
