package program;
import java.util.Scanner;
public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int num = sc.nextInt();
		int temp = num, reverseNum = 0, rem;
		
		while (num != 0) {
			rem = num % 10;
			reverseNum = reverseNum * 10 + rem;
			num/= 10;
			
		}
		
		if (temp == reverseNum) {
			System.out.println(temp + " number is palindrome");
		} else {
			System.out.println(temp + " number is not palindrome");
		}
	}

}
