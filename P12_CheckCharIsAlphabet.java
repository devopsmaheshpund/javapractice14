package javapractice14;

import java.util.Scanner;

public class P12_CheckCharIsAlphabet {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = scr.next().charAt(0);
		if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
			System.out.println("Entered char is alphabet");
		} else {
			System.out.println("Entered char is not alphabet");
		}
	}
}
