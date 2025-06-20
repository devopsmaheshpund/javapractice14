package javapractice14.string;

import java.util.Scanner;

public class S9_OccurenceofGivenChar {
	public static void main(String args[]) {
		String str = "Hello";
		Scanner scr = new Scanner(System.in);
		char c = scr.next().charAt(0);
		char charArray[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);
	}
}
