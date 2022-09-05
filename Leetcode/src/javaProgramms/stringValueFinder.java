package javaProgramms;

public class stringValueFinder {

	public static void main(String[] args) {

		///check string has number
		
		String a = "abc1";

		boolean status = false;

		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);

			if (Character.isDigit(c) == true) {
				status = false;
			} else {
				status = true;
			}

		}
		System.out.println(status);

		// return sum of char values 
		
		String str = "abcdAE";
		// if a = 1 , A = 27
		// a = 65 A = 97
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c >= 'A' && c <= 'Z') {
				result = result + c - 64;
			}

			if (c >= 'a' && c <= 'z') {
				result = result + c - 96;
			}

		}

		System.out.println(result);

	}

}
