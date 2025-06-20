package javapractice14;

import java.util.Scanner;

public class P10_CheckCharIsVowel {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = scr.next().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Entered char is vowel");
		} else {
			System.out.println("Entered char is not vowel");
		}
	}
}
