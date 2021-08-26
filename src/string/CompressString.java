package string;

public class CompressString {

	public static void main(String[] args) {
		String str = "AABBBCCCCCD";
		char[] array=str.toCharArray();
		int len=str.length();
		for(int i=0;i<len;i++) {
			int count=1;
			while(i<len-1 && array[i]==array[i+1]) {
				count++;
				i++;
			}
			System.out.print(array[i]+""+count);
		}
		//System.out.println("Java 8????");
	}
}
