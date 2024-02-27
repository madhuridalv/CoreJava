package program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string : ");
		String str = sc.next();
		int strLength = str.length();
		
		System.out.println("Reverse string is : ");
		while (strLength > 0) {
			System.out.print(str.charAt(strLength - 1));
			strLength--;
		}
	}

}
