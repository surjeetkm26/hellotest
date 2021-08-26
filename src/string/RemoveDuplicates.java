package string;

import java.util.stream.Collector;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="HELLOWELCOME";
		String string=str.chars().mapToObj(x->(char)x ).distinct().collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append , StringBuilder::toString));
		System.out.println(string);
		boolean[] test=new boolean[26];
		int k=0;
		char[]array=str.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(!test[array[i]-'A']) {
				array[k++]=array[i];
				test[array[i]-'A']=true;
			}
		}
		System.out.println(new String(array,0,k));
	}

}
