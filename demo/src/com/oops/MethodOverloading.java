package com.oops;

public class MethodOverloading {
	
	public static int addition(int a,int b) {
		return a+b;
		
	}
	
	public static float addition(int a,float b) {
		return a+b;
	}
	public static double addition(double a,double b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		
		System.out.println(addition(10,20));
		System.out.println(addition(15,10.2f));
		System.out.println(addition(20.5d,20.5d));

	}

}
