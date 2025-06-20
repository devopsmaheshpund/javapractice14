package javapractice14;

import java.util.Scanner;

public class P18_PrimeNumber {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Entred number is prime");
		} else {
			System.out.println("Entered number is not prime");
		}
	}
}
