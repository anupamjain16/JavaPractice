package javaProgramms;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String a = "aabccdaaa";
		String b = removeDuplicates(a);
		System.out.println(b);

	}

	private static String removeDuplicates(String str) {
		
		
		
		StringBuilder sb = new StringBuilder();
		char[] arr = str.toCharArray();
		for (char ch : arr) {
			if (sb.indexOf(String.valueOf(ch)) != -1)
				continue;
			else
				sb.append(ch);
		}
		return sb.toString();
	}

	
	
}











