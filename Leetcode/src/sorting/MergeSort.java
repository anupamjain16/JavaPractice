package sorting;

import java.util.Arrays;

///Decending order
public class MergeSort {

	public static void main(String[] args) {

		int arr[] = { 5, 4, 3, 2, 1, 0, -1 };

		int arr2[] = { -1, 0 };

		int arr4[] = merge(arr, arr2);

		int arr3[] = mergeSort(arr);

		System.out.println(Arrays.toString(arr3));

	}

	static int[] mergeSort(int[] arr) {

		if (arr.length == 1) {
			return arr;
		}

		int mid = arr.length / 2;

		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		return merge(left, right);

	}

	static int[] merge(int[] left, int[] right) {

		int i = 0;
		int j = 0;
		int k = 0; // index of mix

		int mix[] = new int[left.length + right.length];

		while (i < left.length && j < right.length) {

			if (left[i] < right[j]) {
				mix[k] = left[i];
				i++;
			} else {
				mix[k] = right[j];
				j++;
			}

			k++;
		}

/// may one array finished before

		while (i < left.length) {
			mix[k] = left[i];
			i++;
			k++;

		}

		while (j < right.length) {
			mix[k] = right[i];
			j++;
			k++;
		}

		return mix;

	}

}
