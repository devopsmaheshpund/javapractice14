package javapractice14;

import java.util.Scanner;

public class P17_CountNumberDigits {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		System.out.println(count);
	}
}
