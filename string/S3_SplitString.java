package javapractice14.string;

public class S3_SplitString {
	public static void main(String args[]) {
		String str = "This is java String";
		String splitString[] = str.split(" ", 4);
		for (String s : splitString) {
			System.out.println(s);
		}
	}
}
