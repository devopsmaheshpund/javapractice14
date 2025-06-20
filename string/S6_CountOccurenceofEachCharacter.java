package javapractice14.string;

import java.util.HashMap;
import java.util.Map;

public class S6_CountOccurenceofEachCharacter {
	public static void main(String args[]) {
		String str = "This is java String";
		String newString = str.replaceAll(" ", "");
		Map<Character, Integer> charCountMap = new HashMap<>();
		char charArray[] = newString.toCharArray();
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);
	}
}
