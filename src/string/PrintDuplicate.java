package string;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class PrintDuplicate {

	public static void printDuplicate(String str) {
		Map<Character, Integer> map=new HashMap<>();
		int[] freq=new int[256];
		for(int i=0;i<str.length();i++) {
			freq[str.charAt(i)]++;
			if(map.get(str.charAt(i))==null)
				map.put(str.charAt(i), 1);
			else
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
		Set<Map.Entry<Character, Integer>> set= map.entrySet();
		for(Map.Entry<Character, Integer> entry: set) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		System.out.println("Second way");
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1) {
				System.out.println((char)i );
			}
		}
		System.out.println("USing stream");
		String string="ABACDB";
		Map<Character, Long> map2= string.chars().mapToObj( x-> (char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map2);
		System.out.println("Print duplicate");
		String str2= map2.entrySet().stream().filter(entry->entry.getValue()>1).map(x->x.getKey()).collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append, StringBuilder::toString));
		System.out.println(str2);
	}

	public static void main(String[] args) {
		printDuplicate("HELLO");
	}

}
