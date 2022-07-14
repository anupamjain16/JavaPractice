package javaProgramms;

import java.util.HashMap;
import java.util.Map;

public class CountWordsMap {

	public static void main(String[] args) {

		String str = "Love Love Love Love me like you do la la la la la Love me like you do do do do";

		String words[] = str.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String i : words) {

			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);

		}

		System.out.println(map);

	}

}
