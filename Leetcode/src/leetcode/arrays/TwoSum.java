package leetcode.arrays;

public class TwoSum {

	public static void main(String[] args) 
	{	
		int a[] = {2,7,11,15};
	   int Target = 9;
		
		groupFinder(a, Target);	
	 
	}
	
	
	public static void groupFinder( int [] a, int Target)
	 {
		 
		int b [] =new int[a.length+1]; 
		int index = 0;		
		
		for (int i = 0; i < a.length; i++) {			
			
			for (int j = i+1; j < a.length; j++) {
			
				if (a[i] + a[j] == Target)
				{
					b[index] = a[i];
					index++;	
					b[index] = a[j];
				}
				
			}
		}
		
		
		for (int i = 0; i < b.length; i++)
		{
		
		System.out.println(b[i]);
		
		}
		
	 }
	
}

 
