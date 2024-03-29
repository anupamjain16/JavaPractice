package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int a[] = { 4, 2, -3, 1, 6 };

		int Target = 6;

		int b[] = groupFinder(a, Target);

		System.out.println(Arrays.toString(b));

	}

	public static int[] groupFinder(int[] numbers, int target) {
		
		
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {

			Integer diff = (Integer) (target - numbers[i]);
			
			
			if (hash.containsKey(diff)) {
				int toReturn[] = { hash.get(diff) + 1, i + 1 };
				return toReturn;
			}

			hash.put(numbers[i], i);

		}

		return null;

	}

}
