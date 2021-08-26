package string;

public class ReverseWord {
	public char[] reverse(char[] array,int start,int end) {
		while(start<end) {
			char tmp=array[start];
			array[start]=array[end];
			array[end]=tmp;
			start++;end--;
		}
		return array;
	}
	public String reverseWord(String str) {
		char[]array=str.toCharArray();
		array=reverse(array, 0, array.length-1);
		int start=0;int end=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==' ') {
				array=reverse(array, start, end-1);
				start=end+1;
			}
			end++;
		}
		array=reverse(array, start, end-1);
		return new String(array);
	}
	public static void main(String[] args) {
		String str="Hello Welcome To The World";
		System.out.println(new ReverseWord().reverseWord(str));
	}

}
