package backtraking;

public class maze {

	public static void main(String[] args) {

		// find all possible path in 3X3 maze from 0,0 to 3,3 R D

		int row = 3;
		int col = 3;
		String pathName = "";

		System.out.println("Total path " + countPath(row, col));

		path(pathName, row, col);

		// if dogonal movement allowed

		System.out.println("Total  path includinig digonal ");
		pathDigonal(pathName, row, col);

	}

	private static void pathDigonal(String pathName, int row, int col) {

		if (row == 1 && col == 1) {

			System.out.println(pathName);

			return;
		}

		if (row > 1 && col > 1) {

			pathDigonal(pathName + 'D', row - 1, col - 1);
		}

		if (row > 1) {
			pathDigonal(pathName + 'V', row - 1, col);

		}

		if (col > 1) {

			pathDigonal(pathName + 'H', row, col - 1);
		}

	}

	private static void path(String pathName, int row, int col) {

		if (row == 1 && col == 1) {

			System.out.println(pathName);

			return;
		}

		if (row > 1) {
			path(pathName + 'D', row - 1, col);

		}

		if (col > 1) {

			path(pathName + 'R', row, col - 1);
		}
	}

	private static int countPath(int row, int col) {

		if (row == 1 || col == 1) {
			return 1;
		}

		int left = countPath(row - 1, col);
		int right = countPath(row, col - 1);

		return left + right;

	}

}
