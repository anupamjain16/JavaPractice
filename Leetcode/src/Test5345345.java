
public class Test5345345 {

	// Given a sorted array of 0's and 1's. Find the count of 1's in the given
	// array.
	// Input - Output
//	[0,0,0,1,1]   ---    2
//	[0,1,1,1]      ---    3
//	[0,0,0,0,1]   ---    1
//	
	public static void main(String[] args) {

		int[] arr = { 0, 1, 1, 1 };

		int a = arr[0];
		int b = arr.length - 1;

		int index = binarySearch(a, b, arr);
		System.out.println(index);
	}

	public static int binarySearch(int a, int b, int arr[]) {

		if (a > b) {
			return 0;
		}

		int mid = a + (b - a) / 2;

		if (arr[mid] == 0) {

			return binarySearch(mid + 1, b, arr);
		}

		else {

			return arr.length - mid + binarySearch(a, mid - 1, arr);
		}

	}
}
