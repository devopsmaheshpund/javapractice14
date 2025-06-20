package javapractice14;

import java.util.Scanner;

public class P11_PositiveNegativeNumbers {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		if (number >= 0) {
			System.out.println("Entered number is positive");
		} else if (number < 0) {

			System.out.println("Entered number is negative");
		}
	}
}
