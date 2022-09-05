package interviews;

// multiple interface can extend.
public interface Interface1 extends Interface2 {

	public int a  = 5;

	
	default void speak() {
		
		System.out.println("Interface1");
	}
	
static void speak2() {
		
		System.out.println("Interface1");
	}

}
