package test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Employee implements Comparable<Employee> {

	private long id;
	private Date date;

	private String name;
	
	private String lname;

    private List<String> languages = new ArrayList<String>();
    
    
	
	
     public Employee(int id, Date date, String name, List<String> languages) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.languages = languages;
	}

	public Employee(long l, String string, String string2) {
		this.id = l;
		
		this.name = string;
		this.lname =string2;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	@Override
	public int compareTo(Employee o1) {

		if (this.id == o1.getId())
			return 0;
		else if (this.id > o1.getId())
			return 1;
		else
			return -1;
	}

	public Date getDate() {
		return date;
	}

	public long getId() {
		return id;
	} 

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", date=" + date + ", name=" + name + ", lname=" + lname + ", languages="
				+ languages + "]";
	}
	


	
	

}
