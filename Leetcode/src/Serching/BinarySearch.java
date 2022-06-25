package Serching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,7,9,11,16,18,19,24,26,39};
		
		int arr2[] = {22,20,18,15,14,13,5,4,3,2,1};
		
		int target= 26;
		
		System.out.println(BinarySerch(arr, target));
		
	}

	private static int BinarySerch(int[] arr,int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		
		while( start<=end)
		{

			int mid = start+(end-start)/2;
			
			if ( target > arr[mid])
				
			{
				start = mid +1 ;  ///right side
			}
			else if ( target < arr[mid])
			{
				end = mid -1;    //left side
			}
			else 
				return mid;
			
		}
		return -1; 
		
		
		
		
		
	
	}

	
	
}
