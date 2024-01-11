
/**
 * 
 */

import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 */
public class interview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = {-1, 0 , -6};

		int arr3[] = square(arr);

		System.out.println(Arrays.toString(arr3));

	}

	
	private static int[] square(int[] arr) {

		int[] arr2 = new int[arr.length];

		for (int i = 0; i <= arr.length - 1; i++) {

			arr2[i] = arr[i] * arr[i];

			// System.out.println(arr2[i]);
		}

		return arr2;
	}

}
