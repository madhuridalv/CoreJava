package program;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		
		String reverseStr = "";
				
		int strLength = str.length();
		
		for (int i = (strLength-1); i>=0; i--) {
			reverseStr = reverseStr + str.charAt(i);
			//System.out.println(reverseStr);
		}
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is palindrome string");
		} else {
			System.out.println(str + " is not palindrome string");
		}
		
	}

}
