package javapractice14;

import java.util.Scanner;

public class P4_MultiplicationTable {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(number * i);
		}
	}
}
