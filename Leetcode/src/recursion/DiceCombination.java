package recursion;

public class DiceCombination {

	/// dice rolled , find all combination of no to euqal to target values
	public static void main(String[] args) {

		int target = 4;
		String processed = "";

		//System.out.println("1" + 1);
		dice(processed, target);

	}

	private static void dice(String processed, int target) {

		if (target == 0) {
			System.out.println(processed);
			return;
		}

		for (int i = 1; i <= target && i <= 4; i++) {
			
			dice(processed + i, target - i);
			
		}

	}

}
