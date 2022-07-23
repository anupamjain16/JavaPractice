package recursion;

import java.util.ArrayList;

////sbuseq using recursion - 

public class SubSeqencesSubSet {

	public static void main(String[] args) {

		String up = "abc";

		// print all sub seq
		 Subseqs("", up);

		// insert all sub seq in ArraylIst

		//SubseqsAscii("", up);

	}

	private static void Subseqs(String processed, String unprocessed) {

		if (unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}

		Subseqs(processed + unprocessed.charAt(0), unprocessed.substring(1));
		Subseqs(processed, unprocessed.substring(1));

	}

	private static ArrayList<String> Subseqs1(String p, String up) {

		if (up.isEmpty()) {

			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		ArrayList<String> left = Subseqs1(p + up.charAt(0), up.substring(1));

		ArrayList<String> right = Subseqs1(p, up.substring(1));

		left.addAll(right);

		return left;

	}

	private static void SubseqsAscii(String p, String up) {

		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		SubseqsAscii(p + up.charAt(0), up.substring(1));
		SubseqsAscii(p, up.substring(1));
		SubseqsAscii(p + (up.charAt(0) + 0), up.substring(1));

	}

}
