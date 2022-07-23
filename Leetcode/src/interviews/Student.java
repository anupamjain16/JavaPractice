package interviews;

// correct implemention of  hashcode and equals

public class Student implements Interface1, Interface2 {

	
	transient String name;
	private int id;

	private String  Name  ;
	

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Student stu = (Student)obj;
		
		return stu.getAge() == this.getAge();
	}
	
	@Override
	public int hashCode() {
		
		// TODO Auto-generated method stub
		
		return this.id;
	}



	@Override
	public void speak() {
		// TODO Auto-generated method stub
		Interface1.super.speak();
	}


	
	
}
