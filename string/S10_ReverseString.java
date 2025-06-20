package javapractice14.string;

public class S10_ReverseString {
	public static void main(String args[]) {
		String str = "Hello";
		String reverseString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println(reverseString);
	}
}
