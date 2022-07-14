package interviewss;

import java.util.Comparator;

public class Student  {

	private int id;
	private String  Name  ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + "]";
	}
	

	
	
	
}
