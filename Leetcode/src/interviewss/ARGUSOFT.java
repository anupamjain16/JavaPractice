package interviewss;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class ARGUSOFT {

	public static void main(String[] args) {
		// take input char and check whether it can create pelindrome word or not

		System.out.println("enter string to check");

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		boolean status = false;

		if (checkPalindrom(str) == true)

		{
			status = true;

		} else {
			for (int i = 0; i < str.length(); i++) {

				for (int j = i + 1; j < str.length(); j++) {

					status = checkPalindrom(str.substring(1, j));

				}

			}

		}
		
		System.out.println(status);

	}

	private static boolean checkPalindrom(String str) {

		String org_str = str;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		if (org_str.equals(rev)) {
			return true;
		} else {
			return false;
		}

	}

}
