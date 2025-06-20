package javapractice14;

import java.util.Scanner;

public class P13_SumofNaturalNumbers {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
