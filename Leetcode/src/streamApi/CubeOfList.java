package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeOfList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> list2 = list.stream().map(e -> e*e*e).collect(Collectors.toList());
		
		System.out.println(list2);
		
		
		
		
	}
}
