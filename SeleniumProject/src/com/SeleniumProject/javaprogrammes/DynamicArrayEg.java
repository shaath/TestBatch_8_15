package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		Object[] x = new Object[5];
		
		System.out.println(x.length);

		x[2] = "Selenium";
		x[4] = 150000;
		x[2] = "Cucumber";
		
//		System.out.println(x[2]);
		
		for(int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);			
		}			
	}

}
