package javapractice14.string;

public class S12_ReverseEachWord {
	public static void main(String args[]) {
		String str = "This is java String";
		String reverseString = "";
		String splitString[] = str.split(" ");
		for (int i = 0; i < splitString.length; i++) {
			String reverseWord = "";
			String words = splitString[i];
			for (int j = words.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + words.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);
	}
}
