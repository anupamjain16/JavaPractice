import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test23434234 {

//		Input ArrayList: [1, -2, 3, -4, 5, -6]
//
//Output: [-2, 1, -4, 3, -6, 5]
//
//In the output, positive and negative numbers alternate while preserving the order of appearance in the input ArrayLi
//			 
//			 System.out.println(operation.pop());
//
//	}

	public static void main(String[] args) {

		int arr[] = { 1, -2, 3, -4, 5, -6 };

		int arr2[] = sort(arr);

		System.out.println(Arrays.toString(arr2));

	}

	private static int[] sort(int[] arr) {

		int arr2[] = new int[arr.length - 1];

		for (int i = 0; i < arr.length - 1 && i < arr2.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {

				int temp = arr[i];
				arr2[i] = arr[i + 1];
				arr2[i + 1] = temp;

			}
		}

		return arr2;
	}

}
