package javaProgramms;

import java.util.Arrays;
import java.util.Collections;

public class CheckAnagram {

	public static void main(String[] args) {
	
		//Anagram means first string have same char as string sencond
		
		String s1 = "boyps";
		String s2 ="soby";
		
		
		boolean status = true;
		

         char s3[] = s1.toCharArray();
         char s4[] = s2.toCharArray();
         
        
         Arrays.sort(s3);
         Arrays.sort(s4);
         
      
         for (int i = 0; i < s4.length; i++) {
			
        	 if ( s3[i]!=s4[i])
        	 {
        		 status = false;
        	 }
		}
		
		
		
		System.out.println(status);
		

	}

}
