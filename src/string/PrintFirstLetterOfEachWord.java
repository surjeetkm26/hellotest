package string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintFirstLetterOfEachWord {
	
	public static void printFirstLetterOfEachWOrd(String str) {
		char[] array=str.toCharArray();
		boolean test=true;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=' ' && test) {
				System.out.print(array[i]);
				test=false;
			}
			if(array[i]==' ')
				test=true;
		}
	}
	public static void main(String[] args) {
		
		printFirstLetterOfEachWOrd("Surjeet Kumar Mohanty");
		System.out.println("===========Print All Unique Words=============");
		String str="Hello Welcome Surjeet Hello a Hike a";
		Stream<String> stream=Stream.of(str.split(" "));
		String string= stream.distinct().collect(Collectors.joining(" "));
		System.out.println(string);
		
		
	}

}
