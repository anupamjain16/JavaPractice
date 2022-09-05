package test;

public class Landisgarg {

	public static void main(String[] args) {

		// Given a string s, consisting of "X" and "Y"s,
		// delete the minimum number of characters such that there's no consecutive "X"
		// and no consecutive "Y"
		// Input Output
		// "YYYXYXX" "YXYX"

		String s = "YYYXYXX";
		System.out.println(removeDuplicate(s));

		///// Write a program to check a 3by3 matrix is identity matrix or not (all
		///// diagonal numbers are 1 and other numbers are 0) like {{0 0 1} ,{0 1 0} ,{1
		///// 0 0}}

		

		int arr[][] = { { 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } };

		System.out.println(check2Dmatrix(arr));

	}

	public static String removeDuplicate(String s) {

		char[] arr = s.toCharArray();

		String output = "";

		for (int i = 0; i < arr.length - 1; i++) {

			char c1 = arr[i];
			char c2 = arr[i + 1];

			if (c1 == c2) {
				arr[i] = 0;
			}

			if (arr[i] != 0) {
				output = output + arr[i];
			}

		}

		return output;

	}

	public static boolean check2Dmatrix(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i + j == 2) {

					if (arr[i][j] == 1) {

					} else {
						return false;
					}

				} else {

					if (arr[i][j] == 0) {

					} else {
						return false;
					}

				}

			}

		}

		return true;
	}

}
