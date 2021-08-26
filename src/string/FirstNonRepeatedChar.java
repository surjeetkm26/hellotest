package string;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str="ABADEEFBFFF";
		Map<Character, Long> map=str.chars().mapToObj(x->(char)x )
									.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	char ch=map.entrySet().stream().filter(entry->entry.getValue()>1).map(x->x.getKey()).findFirst().get();
	System.out.println(ch);
	System.out.println("Find Max char that occurs");
	char max=map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(x->x.getKey()).get();
	System.out.println(max);
	}

}
