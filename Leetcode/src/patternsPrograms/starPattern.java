package patternsPrograms;

public class starPattern {
	public static void main(String[] args) {

		
		
		pattern(5, 0);
		

	}

	private static void pattern(int r, int c) {

		if (r == 0) {
			return;
		}

		if (c < r) {
			
			pattern(r, c + 1);
			System.out.print(" * ");
		} 
		else {
			
		
			pattern(r-1, 0);
			System.out.println(" * ");
		}

	}

}
