package leetcode.arrays;

public class CountWordOccurance {
	public static void main(String[] args) {	
	String str = "My name is blah blah blah bhai saaab";
	int x = occurance(str,"blah");
	System.out.println(x);		
	}	
	public static int occurance(String str, String found) {		
		int count =0;
		String[] a = str.split(" ");
		for (int i = 0; i < a.length; i++) {					
				if (a[i].equals(found))
					 count++;									
		}		
		return count;		
	}
		
	}
	
