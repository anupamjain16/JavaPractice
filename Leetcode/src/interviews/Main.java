package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import javax.swing.text.html.Option;

//    -> two interface have same default method then using super  keyword we can specify
//  
class Main {

	public static void main(String[] args) throws InterruptedException {

//		ThreaCreation t1 = new ThreaCreation();
//		// t1.run();
//
//		//B ob = new B();
//
//		//A ob1 = new D();
//		//ob1.method1();
//		// System.out.println(ob1.x);
//
//		String story = "It was a hot summer day. A crow felt very thirsty. He flew here and there in search of water. He could not find water anywhere. As he was flying over a park, he saw a jug with little water in it. The water in the jug was so low that its beak could not  touch it.  He was a  clever crow. He picked up small pieces of stones and put them in a  pitcher. The level of the water started rising. He continued putting pieces of stones in the jug when he saw that water level had risen high up. He drank the water  and flew away.";
//
//		String[] words = story.split(" ");
//
//		Arrays.sort(words);
//
//		HashMap<String, String> marksMap = new HashMap<String, String>();
//		
//		marksMap.put("Satyam", "123");
//		marksMap.put("Satyam", "456");
//		marksMap.put("SaTyam", "456");
//	
//		
//		marksMap = null;
//		
//		
//		//String mark = marksMap.get("SaTyam");
//		
//		Optional<HashMap<String, String>> checknull = Optional.ofNullable(marksMap);
//		
//		if ( checknull.isPresent())
//		{
//			System.out.println(marksMap.get("SaTyam"));
//		}
//		else
//		{
//			System.out.println(" it is null");
//		}
//		
//		
//		
//		
//		//System.out.println(mark);
//		
//		
//		//System.out.println(marksMap.size());
//
////		marksMap.entrySet().forEach(e -> {
////		System.out.println();
////		}
////
////		);
//
//		List<Student> list = new ArrayList<Student>();
//		//list.add(new ("Satyam", 21));
//		list.add(new Student("Sumit", 24));
//		list.add(new Student("Ankuj", 2));
//		list.add(new Student("Saurabh", 33));
//		list.add(new Student("Madhav", 45));
//
//		// list of names where age > 21
//
//		List<Integer> list2 = list.stream().map(Student::getAge).collect(Collectors.toList());
//
//		Iterator<Student> iterator = list.iterator();
//
//		while (iterator.hasNext()) {
//
//			// System.out.println("in iterator");
//
//			// System.out.println(iterator.next().toString());
//
//			// list.add(((Student) iterator.next()).getName());
//
//		}
//
//		// System.out.println(list2.get(1));
//
//		// Avg age from above list
//
//		OptionalDouble avg = list.stream().mapToInt(e -> e.getAge()).average();
//
//		// list to map "name" : "age"
//
//		// List<Student> list3 = list.stream.map()
//
//		// clone
//
//		Student student = new Student("rambu", 23);
//
//		try {
//			Student student2 = (Student) student.clone();
//			// System.out.println(student2.getName());
//
//		} catch (CloneNotSupportedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//		// public class A {public static void main(String[] args){ if (true) break;}}
//		
		
		List<Integer> list32323 = Arrays.asList(102,10,3,1,6,100,11,1,7,100);
		//1 ,10 ,11,100, 102
		
		
		Object list21 = list32323.stream().distinct().sorted()
				.map(e -> String.valueOf(e))
				.filter( e -> ((String) e).startsWith("1")).collect(Collectors.toList());
		
		
		
		
		System.out.println(list21);
		System.out.println(String.valueOf(123));  //convert number in string
		
		
		/// if not orverrid hash and equal method 3 will be size.
		
		  System.out.println("HashSet");
		  
		   HashSet<Student> set = new HashSet<>();
		   
		   Student s1  = new Student("rahul", 10);
		   
		   set.add(new Student("ram", 10));
		   set.add(s1);
		   
		 
		   set.add(new Student("rahul", 10));
		   
		   System.out.println(set.size());
		   
		   set.add(null);
		

	}
}