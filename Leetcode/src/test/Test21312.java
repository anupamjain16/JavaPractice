package test;

public class Test21312 {

	public static void main(String[] args) {

		
		//Sort an Array which contain 1 to N values in O(N) using Cycle Sort
		int arr[] = { -100, -2, 1, 2, 0, 100, 2 }; // -100 to 100

		
		//Find an element in array such that sum of left array is equal to sum of right array
		
		int arr2[] = { 5, 1, 2, 2, 1 }; // -100 to 100 op - i {2,2,2,2} {-2,0,1,0,1}

		
		
		
		System.out.println(privot(arr2));

	}

	private static int privot(int[] arr2) {

		int sumL = 0;

		int sumR = 0;
		int start = 0;
		int end = arr2.length;

		int mid = end / 2;

		for (int i = 0; i < mid; i++) {

			sumL = sumL + arr2[i];

		}

		for (int i = 0; i < mid; i++) {

			sumR = sumR + arr2[i];

		}

		// int left = sum(mid+1 , arr2.length);

		// int right = sum( 0, mid-1);

		if (sumL == sumR)
			return mid;
		else
		{ 
			System.out.println("No pivote");
		}
         
		return -1;

	}

	private static int sum(int[] arr2) {

		int sum = 0;

		for (int i = 0; i < arr2.length; i++) {

			sum = sum + arr2[i];

		}

		return sum;
	}

}
