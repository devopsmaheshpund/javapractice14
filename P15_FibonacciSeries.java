package javapractice14;

import java.util.Scanner;

public class P15_FibonacciSeries {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 1; i <= number; i++) {
			System.out.println(a + ", ");
			int temp = a + b;
			a = b;
			b = temp;
		}
	}
}
