package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FidelityLiftAlgo {

	// floor - 0 to 8
	// lift count 6
	// lift a - 2nd floor lift b - 5th floor
	// Look / sense

	int ListPos[] = { 1, 4, 7, 9, 5, 3 };

	List list = Arrays.asList(1, 4, 7, 9, 5, 3);

	private int Getliftname(List list, int PostionPerson) {

		for (int i = 0; i < list.size(); i++) {

			if (ListPos[i] == PostionPerson) {
				return ListPos[i];
			}

		}
		return -1;

	}

	public static void main(String[] args) {

		int floor[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

		int PostionA = 0;
		int PostionB = 2;
		int PostionPerson = 1;

		FidelityLiftAlgo test = new FidelityLiftAlgo();

		System.out.println(test.Getliftname(PostionA, PostionB, PostionPerson));

	}

}
