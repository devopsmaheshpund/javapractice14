package javapractice14;

import java.util.Scanner;

public class P21_ArmstrongNumber {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		int oNum = number;
		String temp = number + "";
		int length = temp.length();
		int sum = 0;
		while (number != 0) {
			int remainder = number % 10;
			sum = (int) (sum + Math.pow(remainder, length));
			number = number / 10;
		}
		System.out.println(oNum);
		if (oNum == sum) {
			System.out.println("ArmStrong");
		} else {
			System.out.println("Not armstrong");
		}
	}
}
