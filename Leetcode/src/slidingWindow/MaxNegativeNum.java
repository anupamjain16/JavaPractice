package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MaxNegativeNum {

	// first negative number of every window of K size  ---not correct

	public static void main(String[] args) {

		int arr[] = { -1, -3, -2, 4, 0, -5 };

		// ws 2 op - -1 ,-3,-2,0,-5

		int start = 0;
		int end = 0;
		int window_size = 2;

		while (end < arr.length) {
			List<Integer> list = new ArrayList<>();

			if (end - start + 1 < window_size)

			{
				if (arr[end] < 0) {
					System.out.println(arr[end]);
					list.add(arr[end]);

				}
				end++;

			} else if (end - start + 1 == window_size) {

				if (list.size() == 0) {
					System.out.println("0");
				} else {

					System.out.println(list.get(0));

					if (arr[start] == list.get(0)) {

						list.remove(0);

					}

				}
				start++;
				end++;
				list.add(arr[end]);

			}

		}

	}

}
