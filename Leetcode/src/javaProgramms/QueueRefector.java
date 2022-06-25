package javaProgramms;

import java.util.LinkedList;
import java.util.Queue;


public class QueueRefector {

	public static void main(String[] args) {
	
	Queue q = new LinkedList();
	    	
   	 q.add("ran");  
   	 q.add( new Integer(11));
   	 q.add("anupam");
   	  
   	 while(!q.isEmpty())
	{
   	 
   	 System.out.println(q.poll()); 
	}

   	 goOne(3);
   	 goOne(1,2,3);
   	 
	}
	
	final static void goOne( final int x)
	{
		System.out.println(x);
	}
	
	final static void goOne( final int ... x)
	{
		System.out.println(x[0]);
	}

}
