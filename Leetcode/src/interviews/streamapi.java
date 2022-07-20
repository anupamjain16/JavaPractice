package interviews;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamapi {

	public static void main(String[] args) {


		Student student1 = new Student(1, "Rahul");
		Student student2 = new Student(2, "Rahulasd");
		
		Student student3 = new Student(3, "ANU");
		Student student4 = new Student(4, "Ram");

		List<Student> list = new ArrayList<Student>();
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
//		Comparator<Student > comparator = new Comparator<Student>()
//				
//		{
//
//					@Override
//					public int compare(Student o1, Student o2) {
//						
//						 if(o1.getId() == o2.getId())
//					            return o1.getName().compareTo(o2.getName());
//					        else if(o1.getId()> o2.getId())
//					            return 1;
//					        else return -1;
//						
//					}
//		};
//				
//	   	

  	List<Student> List2 = 	list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	  
      System.out.println(List2);
	
		
		
		
	}

}
