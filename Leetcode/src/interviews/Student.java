package interviews;

// correct implemention of  hashcode and equals

public class Student implements Interface1, Interface2 {

	
	transient String name;
	private int id;

	private String  Name  ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + "]";
	}
	

	
	



	public Student(String name, int age) {
		super();
		this.name = name;
		this.id = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return id;
	}



	public void setAge(int age) {
		this.id = age;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + id + "]";
	}
	
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
