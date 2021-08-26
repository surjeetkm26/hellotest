package string;

import java.util.Arrays;

public class SwapCornerWords {

	//		Swap corner words and reverse middle characters
	 //Ex:	 Input : Hello World GFG Welcomes You
		//	 Output :You semocleW GFG dlroW Hello
	public static char[] reverse(char[]array,int start,int end) {
		while(start<end) {
			char ch=array[start];
			array[start]=array[end];
			array[end]=ch;
			start++;end--;
		}
		return array;
	}
	public static String swapCornerWords(String str) {
		char[] array=str.toCharArray();
		array=reverse(array, 0, array.length-1);
		int start=0;int end=0; boolean test=true;
		for(int i=0;i<array.length;i++) {
			if(array[i]==' ' ) {
				if(test){
					array=reverse(array, start, end-1);
					test=false;
				}
				start=end+1;
			}
			end++;
		}
		array=reverse(array, start, end-1);
		return new String(array);
	}
	public static void main(String[] args) {
		String letters = "ABC";
		char[] numbers = { '1', '2', '3' };
		System.out.println(letters + " easy as " + numbers);
		System.out.println(swapCornerWords("Hello World GFG Welcomes You"));
		
		String string="Welcome123()@3hg";
		char[] array=string.toCharArray();
		int k=0;
		for(int i=0;i<array.length;i++) {
			if(Character.isAlphabetic(array[i]))
				array[k++]=array[i];
		}
		System.out.println(new String(array,0,k));
		
	}

}
