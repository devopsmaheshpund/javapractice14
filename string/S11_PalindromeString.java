package javapractice14.string;

import java.util.Scanner;

public class S11_PalindromeString {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scr.nextLine();
		String reverseString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println("Reverse String: " + reverseString);
		if (reverseString.equals(str)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome string");
		}
	}
}
