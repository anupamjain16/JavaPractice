package javaProgramms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapUse {

	public static void main(String[] args) {

  HashMap<String, Integer> student = new HashMap<>();
  
  student.put("Harish", 10);
  student.put("RAM", 90);
  student.put("KUMARISITA", 50);
  
 


  for (Entry<String, Integer> set :
	  student.entrySet()) {

     // Printing all elements of a Map
     //System.out.println(set.getKey() + " = " + set.getValue());
     
     
     //student.entrySet().forEach(Entry -> System.out.println(Entry.getKey()));
     
     
     
     //////Hash Set Use
     
     HashSet<String> stu = new HashSet<>();
     
     System.out.println("hASHset ");
     stu.add("ram");
     System.out.println(stu.size());
     stu.add("ram");
     System.out.println(stu.size());
     stu.add("SHAY");
     System.out.println(stu.size());
     
     
   
    
 }
  

    



	}

}
