package javapractice14.string;

import java.util.HashMap;
import java.util.Map;

public class S13_CountEachVowel {
	public static void main(String args[]) {
		String str = "This is vowel String for aeiou count";
		Map<Character, Integer> charCountMap = new HashMap<>();
		char charArray[] = str.toCharArray();
		for (char c : charArray) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				if (charCountMap.containsKey(c)) {
					charCountMap.put(c, charCountMap.get(c) + 1);
				} else {
					charCountMap.put(c, 1);
				}
			}
		}
		System.out.println(charCountMap);
	}
}
