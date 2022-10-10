package test;

public class JunkFilterString {

	public static void main(String[] args) {

		String str = "1 Tickets $50000Received $40. Expenses $800 . Cheque$200000.";

		System.out.println(sum(str));

	}

	private static int sum(String str) {

		String[] c = str.split("\\$");

		int sum = 0;

		for (int i = 0; i < c.length; i++) {

			String str2 = remove(c[i]);

			// System.out.println(str2);

			sum = sum + Integer.parseInt(str2);

		}
		

		

		return sum;

	}

	private static String remove(String string) {

		char c[] = string.toCharArray();

		for (int i = 0; i < c.length; i++) {

			if (!Character.isDigit(c[i])) {

				c[i] = '\u0000';
			}

		}

		String str = new String(c);

		return str.trim();

	}

}
