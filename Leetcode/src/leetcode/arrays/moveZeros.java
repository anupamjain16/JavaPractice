package leetcode.arrays;

import sorting.BubbleSort;

public class moveZeros {

	public static void main(String[] args) {

		int arr[] = { 2, 0, 4, 0, 43, 0, 4, 0, 5, 0 };

		int count = 0;

		for (int i = 0; i < arr.length; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i];


		while (count < arr.length)
			arr[count++] = 0;

	
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

}
