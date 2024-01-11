package javaProgramms;

public class KadansAlgo {

	public static void main(String[] args) {
		
// Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
	
		
		int arr[] = {1,2,3,-2,5};
	System.out.println(maxSubarraySum(arr, arr.length));
		
	}
	public static long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        long sum = 0;
        long MaxSum = 0;
        
        for( int i = 0; i < n ; i++)
        {
              sum = sum+arr[i];
             
             if (MaxSum < sum)
             {
                 MaxSum = sum;
             }
            
             if (sum < 0)
               {
                  sum = 0;
               }
            
            
        }
        
        return MaxSum;
        
    }

}
