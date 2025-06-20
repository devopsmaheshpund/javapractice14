package javapractice14.string;

public class S2_TrimHaidAndTrailSpaces {
	public static void main(String args[]) {
		String str = "       This is java String with head and trail spaces         ";
		System.out.println("String before Trim: " + str);
		String trimmedString = str.trim();
		System.out.println("String after trim: " + trimmedString);
	}
}
