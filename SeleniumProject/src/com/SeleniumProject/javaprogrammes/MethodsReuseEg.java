package com.SeleniumProject.javaprogrammes;

public class MethodsReuseEg {

	public static void main(String[] args) {
		
		MethodsEg.method1();
		
		MethodsEg me = new MethodsEg();
		
		int res = me.sum(20, 30);
		System.out.println(res);
		
		double res1 = me.sum(444.44, 333.33);
		System.out.println(res1);
		
		res = me.sum(30, 20, 20);
		System.out.println(res);

	}

}
