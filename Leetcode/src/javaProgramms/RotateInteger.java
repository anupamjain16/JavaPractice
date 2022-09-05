package javaProgramms;

import java.util.Arrays;

public class RotateInteger {

	public static void main(String[] args) {


		int a = 4321;
		
		
		String st = "are  eae   ewr  e";
		st.trim();
		System.out.println(st);
		
		
		/// remove double spaces from string  
		String words[] = st.split("\\s{2,}");
		
		System.out.println(Arrays.toString(words));
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		
		rotation(a);
		
		 
		
		///reverse the string
		String str= "Geeks", nstr="";
	        char ch;
	        
	      System.out.print("Original word: ");
	      System.out.println("Geeks"); //Example word
	        
	      
	      
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	    
	
	
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
