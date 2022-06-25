package streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergeList {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(2,3,4,6,45,4,6);
		List<Integer> list2 = Arrays.asList(7,8,15,75,90);
		
		Stream<Integer> st = list1.stream();
		Stream<Integer> st2 = list2.stream();
		
		List<Integer> list3 = Stream.concat(st, st2).collect(Collectors.toList());
		
		System.out.println(list3);
		
		
		List<Integer> list4 = list1.stream().distinct().collect(Collectors.toList());
		System.out.println(list4);
		
		
	}
}
