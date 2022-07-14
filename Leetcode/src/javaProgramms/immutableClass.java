package javaProgramms;

//To create an immutable class in Java, you have to do the following steps.

//Declare the class as final so it can’t be extended.
//Make all fields private so that direct access is not allowed.
//Don’t provide setter methods for variables.
//Make all mutable fields final so that its value can be assigned only once.
//Initialize all the fields via a constructor performing deep copy.
//Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
//		
//		
		
		
public final class immutableClass implements Cloneable {

	private final String  name="dfgdfg";
	

	
	public String getName() {
		
		
		return name;
	
	}
	
	
	
	
	
}
