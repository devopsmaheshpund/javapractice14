package javapractice14;

import java.util.Scanner;

public class P9_EvenOdd {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		if (number % 2 == 0) {
			System.out.println("Entered number is even");
		} else {
			System.out.println("Entered number is odd");
		}
	}
}
