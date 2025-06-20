package javapractice14.string;

public class S5_ConvertStringtoInt {
	public static void main(String args[]) {
		String str = "123";
		int number = Integer.parseInt(str);
		System.out.println(str);
		System.out.println(((Object) number).getClass());
		// int to string
		String s = Integer.toString(number);
		System.out.println(s);
		System.out.println(s.getClass());
	}
}
