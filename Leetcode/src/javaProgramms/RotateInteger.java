package javaProgramms;

public class RotateInteger {

	public static void main(String[] args) {


		int a = 4321;
		
		
		rotation(a);
	
	
	}

	private static void rotation(int a) {
		
        int length = count(a);	
		
		double powTen = Math.pow(10, length-1);
		
		System.out.println(powTen);
		
		
		
		for (int i = 0; i < length -1; i++) 
		
		{
			int FirstDigit = (int) (a/powTen);
			
			System.out.println(FirstDigit);
			
			int left = (int) (((a *10)+FirstDigit)- (FirstDigit*10*powTen));
			
			System.out.println(left);
			
			a= left;
			
		}
		
		
	
	}

	private static int count(int a) {
      
		int count = 0;
      while( a> 0)
      {
    	  a=  a/10;
    	  count ++;
      }
		
      return count;
      
	}
	
	

}
