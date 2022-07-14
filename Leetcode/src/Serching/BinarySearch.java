package Serching;

///Binary search with recrusion
public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 9, 11, 16, 18, 19, 24, 26, 39 };

		int target = 3;

		System.out.println(BinarySerch(arr, target, 0, arr.length - 1) + 1);

	}

	static int BinarySerch(int[] arr, int target, int s, int e) {

		int mid = s + (e - s) / 2;

		if (s > e) {
			return -1;
		}

		if (arr[mid] == target) {
			return mid;
		}

		if (target < arr[mid]) {
			return BinarySerch(arr, target, s, mid - 1);
		} else {
			return BinarySerch(arr, target, mid + 1, e);
		}

	}

}
