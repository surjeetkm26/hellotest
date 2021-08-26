package string;

public class ReverseStringRecursive {

	public static String reverse(String str) {
		if(str.length()<=0)
			return str;
		return reverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(reverse("HELLO WELCOME"));
		String str="ABC2DB9";
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				System.out.println("Contains Digit:"+ str.charAt(i));
			}
		}
	}

}
