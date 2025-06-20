package javapractice14.pattern;

public class Pattern4 {
	public static void main(String args[]) {
		for (int i = 5; i >= 0; i--) {
			for (int j = 5 - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
