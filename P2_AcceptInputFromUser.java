package javapractice14;

import java.util.Scanner;

public class P2_AcceptInputFromUser {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scr.nextInt();
		System.out.println("Number is: " + number);

		System.out.println("Enter the string");
		String str = scr.nextLine();
		System.out.println("String is : " + str);
	}
}
