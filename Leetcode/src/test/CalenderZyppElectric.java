package test;

import java.util.Arrays;

public class CalenderZyppElectric {

	/// zypp find the longest week for holiday
	public static void main(String[] args) {

		String a = "L L W W L W W L W W W W W L W L";

		
		char[] cal = a.toCharArray();

		int allowedLeave = 2;

		for (int i = 0; i < cal.length; i++)

		{
			if (cal[i] == 'W' && allowedLeave > 0) {
				cal[i] = 'L';
				allowedLeave--;
			}

		}
		
		System.out.println(Arrays.toString(cal));

		System.out.println(findLongestString(cal));
	}

	private static int findLongestString(char[] cal) {

		int countLeave = 0;

		for (int i = 0; i < cal.length; i++) {

			if (cal[i] == 'L')
				countLeave++;
		}

		return countLeave;
	}

}
