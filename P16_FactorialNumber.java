package javapractice14;

import java.util.Scanner;

public class P16_FactorialNumber {
	public static void main(String agrs[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
