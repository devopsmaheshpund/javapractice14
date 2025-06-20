package javapractice14;

import java.util.Scanner;

public class P20_PalindromeNumber {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		int reverse = 0;
		int oNum = number;
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println(reverse);
		if (oNum == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
