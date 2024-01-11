package test;

import java.util.Arrays;

public class Impetus {

	public static void main(String[] args) {

		
		
		// print word count
		String str = "asdf wedf asdf asdf asdf asdf er ewtrw";		
		
		String[] arr4 = str.split(" ");
		
		System.out.println("count of words "+arr4.length+ Arrays.toString(arr4));
		
	
		
		// sort the array.
	

		int[] arr2 = { 0, 1, 0, 0, 1, 1, 0 };

		for (int i = 0; i < arr2.length; i++) {

			
			for (int j = 1; j < arr2.length-1; j++) {

				
				if (arr2[j-1] < arr2[j]) 
				{
					 int temp = arr2[j-1];
					arr2[j-1] = arr2[j];
					arr2[j] = temp;
				}

			}

		}
		
		System.out.println(Arrays.toString(arr2));

		//
		
		String[] arr = { "abv", "sdf", "abv" };
		System.out.println(Arrays.toString(arr));


		for (int i = 0; i < arr.length; i++)

		{

			for (int j = 0; j < i; j++) {

				if (arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
		
		char c[] = { 'a' , 'b', 'c', 'd'};
		
		String str2 = String.valueOf(c);
		
		System.out.println(str2);
		
		/// We have two array one have one element extra print that.
		
		char c2[] = { 'a' , 'b', 'c', 'd'};
		char c3[] = { 'a' , 'b', 'c', 'd','e'};
		
		int shorterLength = Math.min(c2.length, c3.length);

		
		System.out.println("The extra element is: " + (c2.length > c3.length ? c2[c2.length - 1] : c3[c3.length - 1]));
		
		  
		

	}

}
