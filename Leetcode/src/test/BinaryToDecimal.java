package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryToDecimal {

	public static void main(String[] args) {

		int a = 7;

		// op 1010
		/// reverse the string remaining.

		
		System.out.println((decimalToBinary(a)));
	}

	private static String decimalToBinary(int a) {

		// List<Integer> list = new ArrayList<>();

		String str = "";

		// int arr[] = new int[10];
		// int index = 0;

		while (a !=0) {

			// list.add(a % 2);

			str = str + (a % 2);
			a = a / 2;

			// arr[index] =(a%2);
			// index++;

		}

		return str;

	}

}
