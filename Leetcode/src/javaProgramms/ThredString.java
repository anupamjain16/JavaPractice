package javaProgramms;

public class ThredString {

	public static void main(String[] args) {
  String a1 = "abc";
    Long l1 = (long) System.identityHashCode(a1);
    a1 =null;
    System.gc();
    try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}  
  String a2 = "abc";
  Long l2 = (long) System.identityHashCode(a2);
   System.out.println(a1==a2);
 //System.out.println(a1.equals(a2));
  System.out.println(l1==l2);      // comparting address of itself.
 System.out.println(l1.equals(l2));  //comparing content 
 

	}
	
	
	
}
