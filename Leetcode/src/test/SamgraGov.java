package test;

import java.util.Arrays;
import java.util.Collection;

public class SamgraGov {

	public static void main(String[] args) {

		// Question: Given an array of strings strs, you need to group all the anagrams
		// together. You can return the answer in any order.

		// Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
		// Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]

		String arr[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

		String op[][] = new String[arr.length][arr.length];

		for (int i = 0; i < arr.length; i++)

		{

			for (int k = i+1; k < op.length; k++)

			{
				if (checkAnagram(arr[i], arr[k])) {

					System.out.println(arr[i] + " " + arr[k]);
				}

			}

		}

	}

	private static boolean checkAnagram(String string, String string2) {

		char c[] = string.toCharArray();

		Arrays.sort(c);

		String s = new String(c);

		char c2[] = string2.toCharArray();

		Arrays.sort(c2);

		String s2 = new String(c2);

		return s.equals(s2);
	}

}
