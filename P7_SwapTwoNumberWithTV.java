package javapractice14;

import java.util.Scanner;

public class P7_SwapTwoNumberWithTV {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber = scr.nextInt();
		System.out.println("Enter the second number");
		int secondNumber = scr.nextInt();

		System.out.println("Before Swapping: " + firstNumber + " : " + secondNumber);
		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		System.out.println("After Swapping: " + firstNumber + " : " + secondNumber);

	}
}
