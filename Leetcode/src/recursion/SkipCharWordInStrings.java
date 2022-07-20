package recursion;

public class SkipCharWordInStrings {

	public static void main(String[] args) {

		String processed = "";
		String unprocessed = "abapplecd";

		// remove char in string
		// SkipChar(processed,unprocessed);

		/// remove word from string.
		// System.out.println(SkipApple(unprocessed));

		/// remove app if apple not present

		System.out.println(SkipAppnotApple("abapplcd"));
		System.out.println(SkipAppnotApple("abapplecd"));
	}

	private static String SkipAppnotApple(String unprocessed) {

		if (unprocessed.isEmpty()) {

			return "";
		}

		if (unprocessed.startsWith("app") && !unprocessed.startsWith("apple")) {

			return SkipAppnotApple(unprocessed.substring(3));

		} else {
			return unprocessed.charAt(0) + SkipAppnotApple(unprocessed.substring(1));
		}

	}

	private static String SkipApple(String unprocessed) {

		if (unprocessed.isEmpty()) {

			return "";
		}

		if (unprocessed.startsWith("apple")) {

			return SkipApple(unprocessed.substring(5));

		} else {
			return unprocessed.charAt(0) + SkipApple(unprocessed.substring(1));
		}

	}

	private static void SkipChar(String processed, String unprocessed) {

		if (unprocessed.isEmpty()) {
			System.out.print(processed);
			return;
		}

		char c = unprocessed.charAt(0);

		if (c == 'a') {
			SkipChar(processed, unprocessed.substring(1));
		} else {
			SkipChar(processed + c, unprocessed.substring(1));
		}

	}

}
