package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapp {

	public static void main(String[] args) {

		
		
		List<Map<String, String>> students = new ArrayList<>();

		Map<String, String> data = new HashMap<>();

		data.put("Brute", "Course_4");
		data.put("Mark", "Course_2");
		data.put("Sebby", "Course_1");
		data.put("Mike", "Course_3");
		data.put("John", "Course_1");
		data.put("John", "Course_1");
		data.put("Mike", "Course_3");
		data.put("Mike3", "Course_3");

		students.add(data);
		;

		data = new HashMap<>();
		data.put("Neil", "Course_1");
		data.put("Kelton", "Course_3");
		data.put("Mikael", "Course_4");
		data.put("Micheal", "Course_1");
		data.put("Brenote", "Course_2");
		students.add(data);

		
		
		
		// sort map based on values
		Map<String, Integer> occurance = new HashMap<>();
		
		   
		occurance.put("a", 3);
		occurance.put("b", 1);
		occurance.put("c", 3);
		occurance.put("d", 2);
	
		
		
		System.out.println(occurance);
		
 List list =	occurance.entrySet().stream()
.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(Collectors.toList());

 //.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue),
 //(e1, e2) -> e1, LinkedHashMap::new);
		
		System.out.println(list);

		
		//System.out.println(list);
		
		///flatnning.
		List<List<String>> object2List = new ArrayList<>();
        object2List.add(Arrays.asList("good", "bad"));
        object2List.add(Arrays.asList("worse", "awesome"));

        List<List<String>> object2List_2 = new ArrayList<>();
        object2List_2.add(Arrays.asList("good1", "bad1"));
        object2List_2.add(Arrays.asList("worse1", "awesome1"));

        List<List<List<String>>> object1List = new ArrayList<>();
        object1List.add(object2List);
        object1List.add(object2List_2);

        // Please get me final list of all the Strings

      
        //System.out.println(object1List.stream().flatMap((outer) -> outer.stream()).flatMap((mid) -> mid.stream()).collect(Collectors.toList()));

	  
        int a = 123;
        int temp  = a;
         
         
        while( temp != 0)
         {
        	 System.out.println(temp%10);
        	 temp = temp/10;
         }
        
        
	
	
	}

}
