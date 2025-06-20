package javapractice14;

import java.util.Scanner;

public class P5_ASCIIOfChars {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the char");
		char c = scr.next().charAt(0);
		int ascii = c;
		System.out.println(ascii);
	}
}
