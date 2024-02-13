package program;

import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("fibonacci series till: ");
		int n = sc.nextInt();
		
		int n1 = 0, n2 = 1;
		System.out.println(n1+"\n"+n2);
		for(int i=0; i<n-2; i++) {
			int n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
