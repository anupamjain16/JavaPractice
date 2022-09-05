package javaProgramms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Diffrencefinder {

	public static void main(String[] args) {

		List<String> s = new LinkedList<>();
		s.add("abaavcc");
		// s.add("bcd");

		List<String> t = new LinkedList<>();
		t.add("abaay");
		// t.add("bcdq");

		// System.out.println(s.size());

		// System.out.println(s.toString());
		// System.out.println(s.get(0));

		occuraceFinder(s);
		occuraceFinder(t);

	}

	public static void occuraceFinder(List<String> s) {

		for (int i = 0; i < s.size(); i++) {
			String str = s.get(i);

			Map<Character, Integer> map = occurance(str);
			System.out.println(map);

			//diffrence(map);
		}

	}

	private static Map<Character, Integer> occurance(String str) {

		Map<Character, Integer> map = new HashMap<>();

		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, count);
			}

		}

		return map;

	}

}
