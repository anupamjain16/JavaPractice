package recursion;

import java.util.ArrayList;

public class PermutaionCombination {

	public static void main(String[] args) {

		String unprocessed = "abc";

		String processed = "";

		// permutaions(processed, unprocessed);
		
		
		// get permutations in arraylist.

		System.out.println(permutaionsArrayList(processed, unprocessed));;

	}

	private static void permutaions(String processed, String unprocessed) {

		if (unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}

		int length = processed.length();
		char c = unprocessed.charAt(0);

		for (int i = 0; i <= length; i++) {

			String first = processed.substring(0, i);
			String second = processed.substring(i, length);

			permutaions(first + c + second, unprocessed.substring(1));

		}
	}

	private static ArrayList<String> permutaionsArrayList(String processed, String unprocessed) {

		if (unprocessed.isEmpty()) {

			ArrayList<String> list = new ArrayList<>();

			list.add(processed);
			//System.out.println(list);
			return list;
		}

		int length = processed.length();
		char c = unprocessed.charAt(0);

		ArrayList<String> ans = new ArrayList<>();

		for (int i = 0; i <= length; i++) {

			String first = processed.substring(0, i);
			String second = processed.substring(i, length);

			ans.addAll(permutaionsArrayList(first + c + second, unprocessed.substring(1)));

		}
		return ans;

	}

}
