package program;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int num = sc.nextInt();
		int temp = num, rem;
		double result = 0;
		
		while (num != 0) {
			rem = num % 10;
			result += Math.pow(rem, 3);
			num/= 10;
		}
		
		if (temp == result) {
			System.out.println(temp + " is a armstrong number");
		} else {
			System.out.println(temp + " is not armstrong number");
		}

	}

}
