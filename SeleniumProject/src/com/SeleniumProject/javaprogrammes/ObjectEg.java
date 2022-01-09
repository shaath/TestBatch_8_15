package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[] x = {"Selenium",'M', 40000, 34535.5345, true};
				
		System.out.println(x.length);
		
		for (Object data : x) 
		{
			System.out.println(data);
		}
		

	}

}
