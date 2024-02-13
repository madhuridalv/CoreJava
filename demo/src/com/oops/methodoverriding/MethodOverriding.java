package com.oops.methodoverriding;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rbi rbi = new Rbi();
		System.out.println(rbi.getHomeLoan());
		
		rbi = new Axis();
		System.out.println(rbi.getHomeLoan());
		
		rbi = new Icici();
		System.out.println(rbi.getHomeLoan());
		
		rbi = new BOI();
		System.out.println(rbi.getHomeLoan());

	}

}
