package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) {
		
		Object[][] empDetails = new Object[2][3];
		
		System.out.println(empDetails.length);
		System.out.println(empDetails[0].length);
		
		empDetails[0][0] = "Sharat";
		empDetails[1][2] = 70000;
		
		for (int i = 0; i < empDetails.length; i++)
		{
			for (int j = 0; j < empDetails[i].length; j++) 
			{
				System.out.println(empDetails[i][j]);
				
			}
		}
		

	}

}
