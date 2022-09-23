package test;

public class Tree {

	public static void main(String[] args) {

		
		
       int x =2;
       
		int arr2[] = printPrime(2, 7);

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

	public static int[] printPrime(int y, int z)

	{

		int index = 0;
		int arr[] = new int[z - y + 1];

		for (int i = y; i < z; i++) {
			if (y % i != 0) 
			{
				arr[index] = i;
				index++;
			}
		}

		return arr;
	}

}
