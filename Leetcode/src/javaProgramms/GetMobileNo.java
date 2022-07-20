package javaProgramms;

public class GetMobileNo {

	public static void main(String[] args) {

		String str = "absa1mds9981274477asjddjkl";

		// op - 9981274477

		String numberOnly = str.replaceAll("[^0-9]", "");

		System.out.println(findNuber(str));

	}

	private static String findNuber(String str) {

		str.trim();

		int count = 0;
		String MNO = "";
		for (int i = 0; i < str.length()-1; i++) {

			char c = str.charAt(i);

			if (Character.isDigit(c)) {
				MNO = MNO + c;
				count++;
			}

		}
		
		if (count >10)
		return MNO;
		else return "-1";

	}

}
