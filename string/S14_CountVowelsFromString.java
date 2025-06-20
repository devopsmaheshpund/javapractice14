package javapractice14.string;

public class S14_CountVowelsFromString {
	public static void main(String args[]) {
		String str = "this is vowel string";
		String newString = str.replaceAll(" ", "");
		char ch[] = newString.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (newString.charAt(i) == 'a' || newString.charAt(i) == 'e' || newString.charAt(i) == 'i'
					|| newString.charAt(i) == 'o' || newString.charAt(i) == 'u')
				count++;
		}
		System.out.println(count);

	}
}
