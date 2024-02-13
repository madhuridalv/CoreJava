package com.oops;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main method");
		try {
			System.out.println("In try block");
			int x[] = new int[] {1,2,3,3,4,5};
			System.out.println(x[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In catch block");
			// TODO Auto-generated catch block
			System.out.printf("Index not found at this location ....."+e.getMessage());
		}

	}

}
