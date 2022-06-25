package javaProgramms;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {      
	
    	 
	   Scanner sc= new Scanner(System.in);  
     System.out.print("Enter first number- ");  
       int input1= sc.nextInt();  
       
      System.out.print("Enter second number- ");  
      int input2= sc.nextInt();  
      
      System.out.print("Enter a operation: ");  
      String operation= sc.next();  
      
      sc.close();
  
      System.out.println(result(input1, input2 ,operation));   
   
   
   
   
	}
	private static int result(int input1, int input2, String operation) {
		if(operation.equals("+"))
				{
			return  input1+input2;		
			}
		return 0;
	}

}
