package interviews;

public class PublicisSapient {

	
	// package whatever; // don't place package name!
	// Installed Libraries: JSON-Simple, JUNit 4, Apache Commons Lang3
	 //import java.io.*;
	/* Exercise : Student's Attendence Module

	Create required Classes and their relationships ( Aggregation/Composition/Inheritence etc )

	Create Operations like 
	   1. SubmitAttendence for class, for example class '10th' and day '8th-Jan-2022'        
	      
	      - className
	      - Students with present/absent
	      - attendenceDate
	      - attendenceMarkedBy
	   
	*/
	/*
	@entity
	 class student 
	 {
	   
	    @id 
	    private int id;
	    private String name;
	    private String className;
	    
	    @embded
	    @onetomany
	    private AttandTable attandTable
	    private String attendenceMarkedBy;   
	   
	 }
	 
	 
	 @embadable
	 @entity
	 class AttandTable
	 {
	   
	   private Date attendenceDate;
	   private String attendenceStatus;   
	 }
	 
	 
	 @RestController
	 class StudentController 
	 {
	   
	   @Autowired
	   private StundentService  stundentservice ;
	   
	   
	   @PostrequestMapping ("/stundets/{sudentid}" , @ParmValus)
	                        
	   public saveStundent (String attendenceStatus , int sudentid );
	   
	   return HTTP.Status 200;   
	 }
	 
	 
	 interface  StundentService {   
	   public saveStundent (  ) thorws ioExcpetions;   
	 }
	 
	 class  StundentServiceImpl {
	    public saveStundent( String  attendenceStatus , int sudentid )     {         
	     Student student1    = student.getStudentById(sudentid);
	         studnet1.setattendenceStatus(attendenceStatus);
	    }  
	 }
	 */
	 
	 /*
	
		/*
	class MyCode {
		public static void main (String[] args) {
	    
	*/

	/*
	import java.util.*;
	class Student {
	  public String name;
	  public int age;
	  
	  public Student(String name, int age) {
	    this.name = name;
	    this.age = age;
	  }  
	  
	  public String getName() {
	    return name;
	  }
	  
	  public int getAge() {
	    return age;
	  }
	  public String toString() {
	    return name+" ["+age+"]";
	  }
	}

	class MyCode {
		public static void main (String[] args) {

		// Marks of Student
	    // HashMap<Student, Integer> marksMap = new HashMap<Student, Integer>();
	    // marksMap.put(new Student("Satyam", 21), 100);
	    // marksMap.put(new Student("Satyam", 21), 200);
	    
	    
	    // Integer mark = marksMap.get(new Student("Satyam", 21));
	    // System.out.println(mark);
		
	    
	    List<Student> list = new ArrayList<Student>();
	    list.add(new Student("Satyam", 21));
	    list.add(new Student("Sumit", 24));
	    list.add(new Student("Ankuj", 2));
	    list.add(new Student("Saurabh", 33));
	    list.add(new Student("Madhav", 45));
	    
	    
	    // Collections.sort(new sortByage());
	    
	    
	    // sort on the age
	    // class sortByage implement comparator
	    // {
	      
	    //   public int comapreto (Student  student1 , Student student2)
	    //   {
	    //     return student1.getAge() - student2.getAge();
	    //   }
	      
	    // }
	    
	    
	    
	    
	    // list of names where age > 21
		
	     List<Student> list2 = list.stream.filter(e -> e.getAge()>21).map(e -> e.getName())
	     .Collect(Collectors.toList());
	  
		  // Avg age from above list
	    
		 double avg = list.stream.maptoInt(e -> e.getAge()).average();
	  
	    // list to map "name" : "age"
	    
	    List<Student> list3 = list.stream.map()
	    
	    
	  }
	  
	}
	*/



	/*
	class singleton
	{
	  
	  private static singleton instance;
	  
	  
	  public  static singleton  Getinstance() 
	  {
	     
	     if (singleton instance != null)
	  
	  { 
	    return new singleton();
	  }
	  
	  
	  }
	  
	private singleton();
	    
	  
	}


	class MyCode {
		public static void main (String[] args) {
	    singleton s1 =   singleton.Getinstance();
	    System.out.println(s1);
	    singleton s2 =  singleton.Getinstance();
	    System.out.println(s2);
	  }
	}
	

	class MyCode {
		public static void main (String[] args) {
	    
	    
	    
	     
	    
	    greetings gre = new greetings();
	    
	    gre.set
	    Thred t = new Thred(gre);
	    t.start();
	    
	    
	    
	    
	  }
	}



	class greetings implements runnable
	{
	  
	  private string greet;
	  
	  
	   run
	   {
	     System.out.println(greetings.get);
	   }
	   
	   
	   
	  
	}


*/





}
