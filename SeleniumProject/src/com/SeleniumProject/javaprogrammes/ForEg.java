package com.SeleniumProject.javaprogrammes;

public class ForEg {

	public static void main(String[] args) {
				
		  //Initialization; Condition; Incrementor	
//		for(int i = 1; i <= 10; i++)
//		{
//			System.out.println("Hi");
//		}		
		System.out.println("Incrementor loop");
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
			if(i == 75)
			{
				break;
			}		
		}
		
		for(int i = 1; i <= 100; i++)
		{
			if (i != 27 && i != 50) 
			{
				System.out.println(i);
			}
			
		}
		
		System.out.println("Decrementor loop");
		
		for(int index = 100; index > 0; index--)
		{
			System.out.println(index);
			if(index == 25)
			{
				break;
			}
		}
		
	}

}
