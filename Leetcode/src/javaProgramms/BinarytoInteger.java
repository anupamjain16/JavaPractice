package javaProgramms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinarytoInteger {

	public static void main(String[] args) {
       
		
		List list = new LinkedList<Integer>();
		list.add(1);
		list.add(0);
		list.add(1);
		
		System.out.println(binaryToInteger(list));
		
		

	}

	private static Integer binaryToInteger(List list) {
		
		  int Number = 0;
		  
		  int power = list.size()-1;
		  for (int i = 0; i < list.size(); i++) {
			
			   if ((int)list.get(i) == 1)
			   {
				   Number = (int) (Number+ Math.pow(2, power));
				   
				   
				   //System.out.println(Number);
				   //System.out.println(Number);
			   }
			   power--;
		}
		
		return Number;
	}

}
