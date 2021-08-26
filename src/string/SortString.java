package string;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortString {
	public static void sortString(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {// Acc to length: if(array[j].length()>(array[j+1].length()))
					String tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		String[] array = { "bc", "ace", "mclk", "zb", "ck" ,"v"};
		// sortString(array);

		System.out.println("Using Java 8");
		System.out.println(Arrays.toString(array));
		Stream<String> stream = Stream.of(array);
		List<String> list = stream.sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		String[] arr = list.toArray(new String[] {});
		System.out.println(Arrays.toString(arr));

	}

}
