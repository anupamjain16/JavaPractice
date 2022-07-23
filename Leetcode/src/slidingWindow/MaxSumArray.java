package slidingWindow;

public class MaxSumArray {

	/// find the max sum of two window size sub array.
	
	public static void main(String[] args) {

		int arr[] = { 100, 200, 300, 400 };

		int window_size = 2;

		int start = 0;
		int end = 0;
		int sum = 0;
		int max = 0;

		while (end < arr.length) {

			sum = sum + arr[end];
			if (end - start + 1 < window_size)

			{

				end++;
			}

			else if (end - start + 1 == window_size) {

				max = Math.max(sum, max);
				sum = sum - arr[start];
				end++;
				start++;

			}
		}

		System.out.println(max);

	}

}
