package javapractice14.string;

public class S4_CountCharacterFromString {
	public static void main(String args[]) {
		String str = "This is java String";
		String newString = str.replaceAll(" ", "");
		System.out.println("New String: " + newString);
		char ch[] = newString.toCharArray();
		int charCount = 0;
		for (char c : ch) {
			System.out.println(c);
			charCount++;
		}
		System.out.println(charCount);
	}
}
