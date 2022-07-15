package patternsPrograms;

public class startPatter2 {

	public static void main(String[] args) {

		pattern(10);
		pattern2(3);
		pattern3(10);
		pattern4(10);
		pattern5(5);

	}
	
	private static void pattern5(int n) {

		for (int row = 1; row <= 2*n-1; row++) {

			int colCount = row >n ? 2*n-row:row; 
			for (int col = 1; col <= colCount; col++) {

				System.out.print(" * ");

			}
			System.out.println();
		}
	}
	
	
	private static void pattern4(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print(col+" ");

			}
			System.out.println();
		}
	}
	
	private static void pattern3(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n-row; col++) {

				System.out.print("*");

			}
			System.out.println();
		}
	}

	private static void pattern2(int n) {

		for (int row = 0; row < n; row++) {

			for (int col = 0; col <= n; col++) {

				System.out.print("*");

			}
			System.out.println();
		}
	}

	private static void pattern(int n) {

		for (int row = 0; row < n; row++) {

			for (int col = 0; col <= row; col++) {

				System.out.print("*");

			}
			System.out.println();
		}
	}

}
