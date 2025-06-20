package javapractice14.string;

import java.util.Arrays;

public class S16_AnagramString {
	public static void main(String args[]) {
		String s1 = "peek";
		String s2 = "keep";
		boolean isAnagram = true;
		if (s1.length() != s2.length()) {
			isAnagram = false;
			System.out.println("String is not anagram");
		} else {
			char s1CharArray[] = s1.toCharArray();
			char s2CharArray[] = s2.toCharArray();
			Arrays.sort(s1CharArray);
			Arrays.sort(s2CharArray);
			isAnagram = Arrays.equals(s1CharArray, s2CharArray);
			if (isAnagram) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}
	}
}
