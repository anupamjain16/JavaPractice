package interviews;

public interface Interface2 {

	void speakIP();

	
	default void speak()

 {
	 System.out.println("Interface2");
}
 
 static void speak2() {
		
		System.out.println("Interface2");
	}
 
 
}
