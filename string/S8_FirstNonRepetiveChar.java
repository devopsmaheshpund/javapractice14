package javapractice14.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class S8_FirstNonRepetiveChar {
	public static void main(String args[]) {
		String str = "ThisisjavaStringTovalidateFirstnonrepchar";
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();
		char charArray[] = str.toCharArray();
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);
		Set<Character> charSet = charCountMap.keySet();
		for (char ch : charSet) {
			if (charCountMap.get(ch) == 1) {
				System.out.println(ch + " : " + charCountMap.get(ch));
				break;
			}
		}
	}
}
