package backtraking;

public class MazeWithObstacles {
	
	///Backtracking concept -  make  the change , revese the change

	public static void main(String[] args) {

		/// false is obstacle

		boolean[][] bord = { { true, true, true }, { true, false, true }, { true, true, true } };

		String p = "";
		//pathRestrication(p, bord, 0, 0);

		// can move in all four directions use backtracking to do this.

		
		boolean[][] bord2 = { { true, true, true }, { true, true, true }, { true, true, true } };

		
		AllDirectionpath(p, bord2, 0, 0);

	}

	private static void AllDirectionpath(String p, boolean[][] bord2, int row, int col) {

		int rowLength = bord2.length - 1;
		int colLength = bord2[0].length - 1;

		if (row == rowLength && col == colLength) {
			System.out.println(p);
		}

		if (bord2[row][col] == false) {
			return;
		}

		// Digonaly

//		if (row < rowLength && col < colLength) {
//
//			AllDirectionpath(p + 'D', bord2, row + 1, col + 1);
//		}
		
		bord2[row][col] = false;  //Backtracking

		// Down

		if (row < rowLength) {
			AllDirectionpath(p + 'D', bord2, row + 1, col);

		}

		// Right
		if (col < colLength) {

			AllDirectionpath(p + 'R', bord2, row, col + 1);
		}

		// up
		if (row > 0) {

			AllDirectionpath(p + 'U', bord2, row - 1, col);
		}
		// left
		if (col > 0) {

			AllDirectionpath(p + 'L', bord2, row, col - 1);
		}
		
		
		bord2[row][col] = true;   ///Backtracking
		

	}

	private static void pathRestrication(String p, boolean[][] bord, int row, int col) {

		int rowLength = bord.length - 1;
		int colLength = bord[0].length - 1;

		if (row == rowLength && col == colLength) {
			System.out.println(p);
		}

		if (bord[row][col] == false) {
			return;
		}

		if (row < rowLength && col < colLength) {

			pathRestrication(p + 'D', bord, row + 1, col + 1);
		}

		if (row < rowLength) {
			pathRestrication(p + 'V', bord, row + 1, col);

		}

		if (col < colLength) {

			pathRestrication(p + 'H', bord, row, col + 1);
		}

	}

}
