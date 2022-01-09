package com.SeleniumProject.javaprogrammes;

public class InterfaceResuseEg {

	public static void main(String[] args) {
		
		InterfaceEg ii1 = new InterfaceImplentsEg1();
		
		ii1.Vehicle();
		
		InterfaceImplementsEg2 ii2 = new InterfaceImplementsEg2();
		
		ii2.Vehicle();

	}

}
