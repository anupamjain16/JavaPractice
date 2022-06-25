package leetcode.arrays;

public class Fibonacci {

	public static void main(String[] args)
	{
		
		System.out.println(fibo(3));
	}
	
	public static int fibo(int n)	
	{

		if (n <= 0)
	           return 0;
	      
	        int fibo[]=new int[n+1];
	        fibo[0] = 0; 
	        fibo[1] = 1;
	      
	        // Initialize result
	        int sum = fibo[0] + fibo[1];
	      
	        // Add remaining terms
	        for (int i=2; i<=n; i++)
	        {
	            fibo[i] = fibo[i-1]+fibo[i-2];
	            sum = sum + fibo[i];
	        }
	      
	        return sum;
						
	}
}
