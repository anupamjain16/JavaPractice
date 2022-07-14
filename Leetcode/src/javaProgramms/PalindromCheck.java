package javaProgramms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PalindromCheck {

	
	public static void main(String[] args) {

		System.out.println("enter the string to check");

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		checkPalindrom(str);

		sc.close();
		
		
		

	}

	private static void checkPalindrom(String str) {
		String org_str = str;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		System.out.println(rev);
		if (org_str.equals(rev)) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("Stirng is not palindrom");
		}

	}

}
