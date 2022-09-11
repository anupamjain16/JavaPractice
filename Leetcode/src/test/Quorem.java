package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Quorem {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");

		// System.out.println(str1.hashCode());
		// System.out.println(str2.hashCode());
		// System.out.println(str3.hashCode());
		// System.out.println(str1 == str2);
		// System.out.println(str1.equals(str2));
		//

		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.print(x);

		/*
		 * int a[] = {1,2,4} ;
		 * 
		 * int n = 4; int Totalsum = n*(n+1)/2;
		 * 
		 * int sum = 0; for (int i = 0; i < a.length; i++) { sum = sum+a[i]; }
		 * 
		 * System.out.println(Totalsum-sum);
		 * 
		 * 
		 * char c[] = str1.toCharArray();
		 * 
		 * 
		 * for (int i = 0; i < c.length; i++) {
		 * 
		 * for (int j = 1; j < c.length; j++) {
		 * 
		 * int count; if( c[i] == c[j]) { break; }
		 * 
		 * 
		 * } }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Map<Character, Integer> map = new HashMap<>();
		 * 
		 * 
		 * for (int i = 0; i < c.length; i++) {
		 * 
		 * if ( map.containsKey(c[i])) { map.put(c[i], map.get(c[i])+1); } else {
		 * map.put(c[i], 1); }
		 * 
		 * 
		 * } System.out.println(map);
		 */

		
		// fidelity - make even on side odd one side
		//{1,2,3,4,5,6}
		// {1,3,5,2,4,6}
		// Time complexity - O(n)
		// Space complexity - O(1)

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int i = 0;
		int j = arr.length - 1;

		while (i % 2 == 0) {
			i++;
		}

		while (j % 2 == 1) {
			j--;
		}

		if (i < j)

		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}

}
