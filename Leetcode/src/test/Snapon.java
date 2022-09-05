package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/// Find the max occurance of word in the string.
// how to iterate map and find max value.

public class Snapon {

	public static void main(String[] args) {

		String str = "He man bat man spider man iron man";

		String arr[] = str.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++)

		{

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}

		}

		// System.out.println(map);

		int maxValue = Collections.max(map.values());

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxValue) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}

	}

}
