package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		int[] salary = {10000, 20000, 4000, 40000, 50000, 60000, 70000};
		
		// find length of an array
		System.out.println(salary.length);
		
//		System.out.println(salary[4]);
		
//		for(int i = 0; i < salary.length; i++)
//		{
//			System.out.println(salary[i]);
//		}
		
		for(int data: salary)
		{
			System.out.println(data);
			if (data == 40000) {
				break;
			}
		}
		
	}

}
