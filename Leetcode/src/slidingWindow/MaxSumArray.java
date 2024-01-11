package slidingWindow;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxSumArray {

	/// find the max sum of two window size sub array.
	
	public static void main(String[] args) {

		String test[] = "asdfs asdf sadfwee drsyery a3w4twet".split(" ");
		
		String test2[] = {"A","a","A"};
		 
		 ;
		 
		 
		
		Map<String, Long> wordCount = Arrays.asList(test).stream()
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Iterate over wordCount to print word and count
		for (Map.Entry<String, Long> entry : wordCount.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		
		
		int arr[] = { 100, 200, 300, 400 };

		int window_size = 2;

		int start = 0;
		int end = 0;
		int sum = 0;
		int max = 0;

		while (end < arr.length) {

			sum = sum + arr[end];
			if (end - start + 1 < window_size)

			{

				end++;
			}

			else if (end - start + 1 == window_size) {

				max = Math.max(sum, max);
				sum = sum - arr[start];
				end++;
				start++;

			}
		}

		System.out.println(max);

	}

}
