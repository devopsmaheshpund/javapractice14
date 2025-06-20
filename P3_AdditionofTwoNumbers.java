package javapractice14;

import java.util.Scanner;

public class P3_AdditionofTwoNumbers {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = scr.nextInt();
		System.out.println("Enter second number");
		int secondNumber = scr.nextInt();
		int addition = firstNumber + secondNumber;
		System.out.println("Addition is : " + addition);
	}
}
