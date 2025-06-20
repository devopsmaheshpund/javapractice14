package javapractice14;

import java.util.Scanner;

public class P8_SwapTwoNumberWithoutTV {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int firstNumber = scr.nextInt();
		System.out.println("Enter the second number");
		int secondNumber = scr.nextInt();
		System.out.println("Before Swapping: " + firstNumber + " : " + secondNumber);
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("After Swapping: " + firstNumber + " : " + secondNumber);
	}
}
