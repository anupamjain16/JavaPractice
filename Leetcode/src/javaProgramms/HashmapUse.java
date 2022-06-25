package javaProgramms;

import java.util.HashMap;
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
     System.out.println(set.getKey() + " = "
                        + set.getValue());
     
     
  
 }
  

    



	}

}
