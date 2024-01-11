package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewCodes {

	
	/// Stream api use for get occurnce of each char in map.
	public static void main(String[] args) {

		String str = "this is this is my name";
		
		

		Map<String, Long> charCount = str.chars().mapToObj(c -> Character.toString((char) c))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		
		
		
		
		System.out.println(charCount);
		System.out.println(str.chars().spliterator().characteristics());
		
		
		String str2 = "I am happy Today. Today is my happy day";

		// Split the string into words, removing punctuation
		String[] words = str2.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().split("\\s+");

		Map<String, Integer> wordCounts = new HashMap<>();
		
		for (String word : words) {
		    //wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
		    wordCounts.put(word, wordCounts.getOrDefault(word, 0)+1);
		}

		// Print the word counts
				System.out.println("wordCounts"+wordCounts);
				
		
	char[] c = "anupam".toCharArray();
	 Map<Character,Integer> map = new HashMap<>();	
	 
	 for ( Character char2 : c )
	 {
		 map.put(char2, map.getOrDefault(char2, 0)+1);
	 }
	
		
		// Print the word counts
		System.out.println("wordCounts"+map);
		
		
		//print x no of prime no in given range og y and z
		
		int x = 5;
		int y = 2;
		int z = 100;
		
		
		   int count = 0;

		        for (int i = y; i <= z; i++) {
		            if (isPrime(i)) {
		                System.out.print(i + " ");
		                count++;
		                if (count == x) {
		                    break; // Stop when x prime numbers are found
		                }
		            }
		        }
		    

		    public static boolean isPrime(int num) 
		    {
		        if (num <= 1) {
		            return false;
		        }
		        for (int i = 2; i * i <= num; i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		


		
		/*Employee e1, e2


e1 -> name and id -> "abc", 1

e2 -> "abc", 1


set s1 -> add e1, e2





overridden both equals and hashcode  1

only equals  2    

only hashcode  2


public class Test{   
  
  public static void main (String args[])  
  {  
      String a = "Welcome";  
      String b = "Welcome";  
      String c = new String("Welcome");  
      
      System.out.print(a == b);        true
      System.out.print(" "); 
      System.out.print(a == c.intern());    true     return the same string if available.
      
  }
  }
 

   @functionalinterface
   Interface any {
   
   
        void method();
   
   }
   
   
   
    Any () - > { sysout("asd")};
	
	
	  list = { {1,2} ,{3,4}};
	  
	  list.stream().filter( e ->  e.getsal> 5000).collect(collectos.toList());
	  
	  list.stream().map(Emp::getsal).collect(collectos.toList());
	
	  count();
	  
	  @enableconfiguration
	  @componentscan
	  @autoconfiguration
	  @qualifier

	  spring.profile.active = prod;
	  
 Print the Fname, Lname from 3rd to 6th tuple of Employee table when sorted according to the Salary.
	  
	  
	  
	  select Fname, Lname
	  from emp
	  order by salary 
	  where rownum between 3 and 6;
	  
	  
Employee table

name gender

ABC F

XYZ M

MNO F

KLM M


 update emp
 set gender = 
 (case when gender = F then   M
       when gender = M then   F)
 END;
 
 ;
  
 
  List list =  Arrays.asList( 1,2,3,4,5);
	  
	  
	  list.stream().maptoint(e -> e+e).collect(collectors.toList());
	  
	  
	  
emp
id
sal
fname
lname


List list = new linkedlist();


 list.add( new emp( "".))
 
 
 list.stream.sort(Comparator.comapring(Emp::GetLname)).reverse().Collect(collectors.toList);
 
 String str = "maharabharat";
 
  Map map = new Hashmap();
  
  
  for( int i = 0 ; i < str.length ; i++)
  {
  
      char c = str.charAt(i);
     if( map.containskey(c))
	 {
	      map.put( c ,map.get(c)+1 );	 
	 }
	 else
	 {
	    map.put(c , 1);
	 }

  }
  
  Write an update query to increase salary by 5k to 
  employees who are getting 10k to 30k
  
  
 update emp
 set sal to sal+5000 
 where empid in (select empid from emp where sal between 10,000 and 30,000);

 
 @Autowire
 Private Service service;
 
 
 @getmapping("/emp/{salary}")
 public Response entiry<Employee>  list getEmp( @pathvariable  salary int sal )
 {
 
 
   return new reponseentity( service.getEmp(sal) , Httpstatus.ok);
 }
 
 
 
  class service
  {
    
	public list getEmp(sal)
{	  
	 String query  = "slect empname from emp where sal > :sal ";
	 
	 Statement st = new Prepared statment;
	 
	 
	 List list =new arraylist();
	 
	 
	 list = st.executequery(query);
	 
	 
	 return list;
	 
	 
 }     
  }
 
  
  
    Map  map = new map();
	
	
	 list.stream.collect(collectros.groupingby (Emplyee::getAge)).toMap( key )
	  
	 list.stream.filter( e -> e.getAge > 45).collect(Collectors.toMap( Emplyee::getname ,Emplyee::getAge );
	 
	 
	 @trdtcontri
	 
  
using stream find the second highest salary employee

list.stream.sorted(comparator.comparing(Emp::getsal)).reverse().skip(1).

 
*__
**_
***
**_
*__


count = 3;
  
  printStar( int row, int col)
  {
  if ( row == 0)
	    return ;
 if(col < row )		
		
		
	  Sysout(*);
	 else
	  Sysout.printl(*)
	    count--;
	
	printStar(count);
		
		
	   
  }
  
 
 order table:  order_id, customer_id, order_date, order_amount


customer table:  customer_id, name, email, phone



1. write sql query using join to get those customers who have not placed any order

    select name
	from customer where customer_id not in (select customer_id from order );
	
	
	SELECT c.*
FROM Customers c
LEFT JOIN Orders o ON c.CustomerID = o.CustomerID
WHERE o.OrderID IS NULL;

 
 SELECT C.Name FROM Customers C LEFT JOIN Orders O ON C.Id = O.CustomerId WHERE O.CustomerId is NULL.
 
 

2. write sql to get those customer who have placed order in the current month

      
	  select customer_id
	  from order
	  where order_date  = DATE_TRUNC('month', CURRENT_DATE);
	  


write a sql query to get the list of  employees who have their birthdays today

 
SELECT *
FROM Employees
WHERE MONTH(EmployeeDOB) = MONTH(CURRENT_DATE)
AND DAY(EmployeeDOB) = DAY(CURRENT_DATE);

 




  PUBLIC interface dataEXTRACTOR
  {
  
    public getdata();
  
  }
  
  
  
  class filetype extend dataEXTRACTOR 
  (
  
  
  @getdata()
  {
  
  
  }
  
  class xls extend filetype()
  {
  
  }
  class csv extend filetype()
  
  
  
  main ()
  {
  
    
	
 String str = "abc.xls";
              abcd.xls;
				 cs.pdf;
   
	if ( ext.equals(xls))
	   new xls()
	
	if (ext.equals(pdf) )  
	
	
	
	
	filetype o = new  xls();
	
  
  

  
  @putmappinh(path ="/emp/{empid}")
  public responenetity<Employee> update(@pathvariable  int empid , @requestbody emp)
  
 {
 
        return  new responseEntity service.update(empid);
 
 }
 

 
 Given a sorted array of distinct integers and a target value, return the index if the target is found. 
  If not, return the index where it would be if it were inserted in order.
You must�write an algorithm with�O(log n)�runtime complexity.

public class SearchInsertIndex {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Target not found, return insertion index
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int index = searchInsert(nums, target);
        System.out.println("Index: " + index); // Output: 2
    }
}

 
  class shortbyAge implement comparator
{


   public comareTo( o1 ,o2)
   {
      return o2.age - o1.age;
   }

 class shortbyName implement comparator
{


   public comareTo( o1 ,o2)
   {
      return o2.name - o1.name;
   }

}  


   person p1 = new person;
      person p2 = new person;


  collection.sort(shortbyName,shortbyAge );


 
 int arr[] = {1,2,3,4,5,6,7,8,9,10};
 
 
 arr = {-1,0,1,-1,0,2,-1,-4}
 
 sum = 0
 -1,-1,2
 -1,0,1
 
 int index [] ;
 
 int count =0;
 
 for(int i = 0; i < arr.length ; i++)
 {
      sum = arr[i]+sum;
	  
	  count++;
	   if (sum == 0 && count ==3)
	     {
		      
		 }
		 
		 while( Sum!= 0)
		 {
		 
		 }
		 
		 
 
 }
 
 

  Q) Find the missing number from the list without sorting it when length is giving.
  List<Integer> intList = new ArrayList<>(
            List.of(3,1,5,4,2,7,9,8,0));


Int sum =  0;
Int  n = 0;

for( int i = 0 ; i < arr.length() ; i++)
{
    Sum = sum + arr[i];
     n = Math.max(arr[i] , max);
 }
 
Int totSum = n*(n+1)/2;
Int ans = totSum - Sum;

Return ans;

		
class A 
{
     
}
 
class B extends A
{
     
}
 
class C extends B
{
     
}
 
public class MainClass 
{
    static void overloadedMethod(A a)
    {
        System.out.println("ONE");
    }
     
    static void overloadedMethod(B b)
    {
        System.out.println("TWO");
    }
     
    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }
     
    public static void main(String[] args)
    {
        C c = new C();
         
        overloadedMethod(c); Two
    }
}
Method Resolution: When overloadedMethod(c) is called:
The compiler looks for the most specific method that matches the argument's type.
Since c is an object of class C, and C is a subclass of B, the method overloadedMethod(B b) is the most specific match and takes precedence over the more general overloadedMethod(Object obj).
Execution: The overloadedMethod(B b) method executes, printing "TWO" to the console.



Class A 
{
Int a =10;

public static void main(String[] args)
{
System.out.println(Hi);
}
}

P: N Y
E: N Y
I: Y Y
A:  N Y




public class FailFastExample
{
    
    
    public static void main(String[] args)
    {
        Map<String,String> premiumPhone = new HashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Apple", "Xperia Z");
            premiumPhone.put("Samsung", "Xperia Z");
        }
        
    }
    
}




public class Test {
    public static void main(String... args) {
        Test test = null;
        test.greeting(); // call with null reference
    }
    public static void greeting() {
        System.out.println("Hello World");
    }
}


String str1 = new String("java");
String str2 = new String("java");
System.out.println(str1 == str2); //  f 
System.out.println(str1.equals(str2)); //  t 



Q) List<Integer> intList = [...];

Using streams find the first odd number greater than 7, multiply by 3 and then return the result. 

list.stream().filter( e -> e> 7).filter(e -> e%2==1).map(e  - > 3*e).


@getrequestmapping(path = �/www.google.com/id?name=30� )
Public responseentity getmap( @Pathvaliable int id , @Requestparam String name)
{

Return responseEntity.service.getma(id , name);
}



@embded  
@entity  
Class student
  {  
      
    @onetomany
     Private subject;
}


@embdable
@entity
Class subject
{

}





  list( emp1, emp2,)
  
  emp 
  {
  id , name dept
  }

  list.stream().sorted( ( e1, e2 ) -> e1.getName.compareTo(e2.getName)).

 
 2,3,5,5,5,5,5,9,10
   
  A        D
  9       10  a
  9:30    10:30
  9       10:45
  9:10    10:15
  
  pl -  4
  
  10,1,2,90,23
  
  

List<Integer> list = new ArrayList();
list.add(1);
list.add(2);
list.add(3);
list.add(4);

Optional<Integer> first = list.stream().filter(ele -> ele < 2).findFirst();


System.out.println(first.get());



List<Integer> list = new ArrayList();
list.add(1);
list.add(2);
list.add(3);
list.add(4);

Optional<Integer> first = list.stream().filter(ele -> ele < 2)
.map(ele -> {
    System.out.println(ele);
    return ele;
})

.findFirst();

System.out.println(first.get());

 1 1

 list  = Arraus.asList(1,2,3,4,5,6,7,8);
  
  list.stream().filter( e -> e%2 ==0).Collect(collectors.toList());
   

@Bean

class A {

private int a;


  setA()
	{
	}

A() {}

}



@Bean

class B {

<!---- ---->

 @Autowired
 private A a;

B() 

{}

}



Do the dependency injection of class A inside class B.

 
Map<String, String> map = new HashMap<>();

Map<String, String> map = new TreeMap<>();
map.put("key 1", "value 1");
map.put("key 2", "value 2");
map.put("key 3", "value 3");
System.out.println(map.put("key 3", "value 3.1"));
System.out.println(map.put("key 4", "value 4"));
System.out.println(map.put(null, "value 5"));


map.put("key 1", "value 1"); //12345
map.put("key 2", "value 2"); //12345


map.put("key 2", "value 2.1");

if(map.containsKey("Key 2")) {

}

//add element, you have to print if key added was already present or not

Employee(id , name, deptNo)

Map<Employee, String> map = new HashMap<>();

Emp1 (1, abc, 1)
Emp1 (2, abcd, 3)
Emp1 (3, abcef, 2)
------------------------------------------------------------

public static void main(String args[])
{
	Set<String> set = new HashSet<>();
	set.add("Welcome");
	set.add("To");
	set.add("Avizva");
	System.out.println(set.add("Avizva"));
}


------------------------------------------------------------

List<Integer> integerList = new ArrayList<>();
integerList.add(1);
integerList.add(2);
integerList.add(3);

for (Integer integer : integerList) {
	integerList.remove(1);
	System.out.println("Integer " + integer);
}
------------------------------------------------------------


List<String> name =  Arrays.asList("Aman", "Ajay", "Vivek", "Hari", "Mohan", "Vijay", "Ashish", "Mohit", "Zeeshan", "Ravi");

return Hashmap<Character, String>

key - First char of the name you are iterating
value - Last name that starts with the key

   
for (String s : name) {

    Char a =  s.CharAt(0);
    
    for(  int i <=  name.size(); i >=0 ; i--)
    {
        
          String str =   name.get(i);
            
            Char b = str.CharAt(0); 
            
             if( a == b)
             {
             
               map.add(a , str);
             
             }
          
          
    }
    
    
}







 
 






String[] strArr = {"ASD","DER","WQA","ABN","FRT","AXZ"};
For string starting with "A", 
suffix "-DONE" 
and save it in a List in sorted manner and display it using Java 8 Streams

List list = list.stream().filter( e -> "A".startswith(e)).map( e -> e+"-Done").sorted(Comparable.comparing(list)).collect(Collectors.toList());

  list.foreach( e -> Sysout(e));
  
 
 class final Test

 {
   
    private final int a;
	Private String  final a;
	Map  a;

 
 } 


SELECT salary
FROM (
  SELECT employee_id, salary, RANK() OVER (ORDER BY salary DESC) AS rank
  FROM employees
) AS ranked_employees
WHERE rank = 3;

 
 @Restcontroller
 class My_controller
 {
 
 @Autowired
 Private Service service;
   
   
   @Getrequestmapping(path ="/emp/{empid}" )
   public ResponseEntity getEmp( @Pathvariable(valuse = empid)   int id  )
   {
   
     return new ResponseEntity( sevice.getEmp( id) , Httpsstatus.ok )
   }
 
 
 }
 
 
 String  = "Sssiiiimmmpleeest"
 
 op - L


Public void reverlist( Node head)

   
   Node Prev =null;
  Node next = head;
  Node Current = head;
  
 {
  while ( current ! = null && currect.next !=null)
  {
  
     next = currect.next;
	 current.next = Prev;
	 prev =  current;
	 current = next;

  }
 
 }
 
  int arr[]  = { 2,4,6,8};
  
  
  
  
  
    Public int print(arr)
	{   
	    
		
		
    }
	
	

    	
	
	
	
	
	
	
	
	
 	int max = 0; 2   ,6 
	 
	 for( int i= 0 ; i < arr.length ; i++)
	 {
	     		   
		 
	      for(  int j = 1 ; j < arr.length ; j++ )

        {
                if(arr[j]%arr[i] != 0)
				{
				   break;
				}
				else
				{
				    max = arr[i];
				}
				
	     }
	 
	 }
	 return max;
	 
	
	
	}
   
   
   
   
 
 
 
 
 
 
 @Restcontroller
 classs My_contoller
 {
 
  @Autowired
  Private Service service;
  
  
  @PutRequestmapping( path = "/emp")
  public responseentity update (  @Requestbody  Employee emp )
  {
  
   
   return new ResponseEntity(Service.update(emp) , Httpsstatus.ok);
  
  }
  
  
  
 }
 
 
 class service
 {
 
  public void  update(emp)
	{
	     
		 int id = emp.getId();
		
		 Employee emp = emp.getId(id);
	 
	     emp.set(emp);
	 
	}
	
	
	public Employee getEmp(int id)
	{
	    
		return   session.get( employee.class , id);
		
	}
	
	
	  
	
	 Properties  properties = new Properties("app.yaml")
	
	 
	
 }
 
 
 
 
 
 
 
     
	 Cline Side       APIgatway      services                     nosql
	  
	                               short(URL) --              id , url  , shortURL    
	                                redirectaapi(shorturl)
								  respons
								     shortURL+timeout;


 
  
@getrequestmapping(path = "/url")  
  public  Responseentity String short( @pathvariable(value = url)  String URL) 
  {
     
	
	String str = "/bittly/"+Math.random()
	
	
	service.save(url , str);
  
  return new Responseenity(str , HTTPstatus.ok);
  
  }
 
 
 emp
 x y z 
 
 select  from emp; 
 
 select count(*) 
 from emp
 group by 
 having count(*)>2;
 
 
  
  
  
  
  
  
  
  
  
   String str = "abc , sdf, sdf , %%232";
   
      String a[] = str.split(",");
	  
	  for( int i = 0 ; i < a.length ; i++)
	  {
	       String str2 = a[i];
            
     for( int j = 0 ; j < str2.length ; j++)
{

  		   if(!Character.isChar())
            
			{
			     a[i] =0;
			}
}	 
		
		
		  Arrays.sort(a);
		    
			

		  
		  Sysout(String.toString(a));

		
	  }
  
  
  
  int a() 
{
	try {
		return 1;
	} catch (Exception e) {
		return 2;
	} finally () {
		return 3;
	}
	return 4;
}


return 3;


map.put(A, 123)
map.put(B, 2121)
map.put(C, 3232)

    list.stream().sorted(Comparator.comparing(Emp::getAge).thencomparingby(Emp::name)).collect(Collectors.toList());
	
	P1 - 50,20,10,40,60,80,100,30,50
    


   class comstomsort implement comparator
   {
   
    @override
	public  void compare( O1 , o2 )
	{
	
	
	}
   
   
   }
   
   
   
  ID	FirstName	LastName	Country
1	Raj			Gupta		India
2	Raj			Gupta		India
3	Mohan		Kumar		USA
4	James		Barry		UK
5	James		Barry		UK
6	James		Barry		UK
7	Raj			Goyal		USA
 
   
   FirstName	LastName	Country
Raj			Gupta		India
James		Barry		UK


    select coun(*) ,FirstName	LastName	Country
	from emp
	group by FirstName	,LastName,	Country
	having count(*) > 1;
   
   delete e1 from emp e1 , emp e2 
   where e1.name = e2.name 
   and  and e1.id > e2.id;
   
2 , 4, 6, 1 , 0, 5 -> 4, 6, -1, 5, 5, -1
2, 7, 3, 5, 4, 6, 8 -> 7, 8, 5, 6, 6, 8, -1


Total Experience: 4 

Relevant Experience : 4
 
Current Salary: 14

Expected Salary: 20

Current Company: orange business

Official Notice Period:  60

Last working day if you have already resigned:  21 oct

Current Location: gurgaon

Preferred location:  gurgaon

Did you apply / attend an interview with Deloitte in past? If yes when it was no

 




@restcontroller
class My_controller
{


 @autowired
 Service service
 
 
 @gptrequrestmapping(path ="/empid/{empid}/?id=23")
 public requestentity list<emp> getAllEmp(@pathvariable int  id , @requestparm  int id)
{               
    
	
	retrun new responsentity(service.getEmp(id) , Http.status.ok)
 }
 
 
 @postmapping( path ="/emp")
 public  responsentity saveEmp( Empoyee emp)
 {
 
 
 retrun new responsentity(service.saveEmp(emp) , Http.status.ok)
 }
 
 
 session.executequery(select * from cust );
 
 
 @embded
 class emp
 {
 
 
  @onetomany
   private Address address;
 
 }
 
 
 
 
 @manytoone
 @embdable
 class address
 {
 
 }
 
 
  Thread t1 = new runnable ( () - > sysout("123))
   
   
   list.stream().filter(Comprator.comparting(Emp::getSal))
   
   
   
   
   
   
   
   
   
   JRE
 JDK  
   JVM
    {
	    
        heap area
		 method area
   
   }
   









  Thread t1 = new runnable( () - > Sysout());
  


List<Employee> empLst;


  empLst.stream().flatmap(empLst -> empLst.stream() ).Max(Employee::getSal).collect(Collectors.toList);
  
  
 Optional<Employee> maxSalaryEmp = 
            employeeList.stream()
            .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

			

  @Restcontroller
  class My_controller
  {
  
  @Autowired
  Private Serive service;
  
  @Getrequestmapping( path ="/emp/{empid}")
  public Responsentiry getEmp(@Pathvariable int empid)

{

 
 return new responseentity.(Service.getEmp(empid), Httpsstatus.ok);

}  
  
  
  Interface service
  {
    
	 public getEmp(empid);
  
  }
  
   
  class ServiceImpl implements  service
  {
     
	 @Autowired
	 private Repository repositry;
	 
	 @override
	 public Employee getEmp(empid) 
	 {
	    
	      Employee emp = get(employee.class , empid);
	 
	 return emp;
	 }
  
  }
  
  
  class Repository
  {
  
      
  
  
  }
  
  
  
  
  create or replace Procedure empdetails
  
   as
   begin
   
   Cursore c1
   select name from employee;
   
   open c1
   
   end empdetails  ;
  
  
  
  
   select sal , ( denseRank() over  orderby sal desc ) n
   from emp where n =3;
 
  
 
 List list = list.stream().filter( e -> e%3==0).collect(Collectors.toList());  
  
  
  
input1 - interview
input2 - view
output - true

input1 - interview
input2 - viewtt
output - false

input1 - interview
input2 - viewin
output - true
  
  
public boolean check( str1 , str2)
{
     if(str1.contains(str2))
	    return true;
		
    for( int i = 0; i< str1.length; )		




}







   Interface  car
   {
   }
   
   
   class Hondacar implement car
   {
      // Required properties
	  
	  private Engine engine;
      

     //optional properties
     
   private Rooftop roof;  
   
   
   }
   
   class Builder 
   {
      
	  
	  publuc build()
	  {
    
        if(  Car.getEngine == null  )
		{
		   throw Exception;
		 }
		
	// Required properties
	  
	  private Engine engine;
      

     //optional properties
     
   private Rooftop roof
     
   
   }
   
   }
   


 public class Abc   

{  

    public static void main (String args[])   

    {  

        System.out.println(100 + 100 +�Simplilearn");   

        System.out.println(�E-Learning Company" + 100 + 100);  

    }  

}




 
 2nd largest repeating no.

   8 3 2 2 9 1 3 4 4

op- 2


   7 9 2 3 1 7 6 1 2

op - 2





   
  Sort an array of 0s, 1s and 2s
  
 

 Input : [ 0 ,1 ,1,1, 0,2,0,2,0,1,2 ]
 
  int start = 0;
  int mid = 0;
  int end = arr.legth -1;

  
 while( start < end)
 {
         if(arr[start] == 1)
		 {
		    
		    mid ++;
		 }
		 
		  else if(arr[start] == 2)
		 {
		   swap( arr[start] , a[end])
		   end --;
		 }
		 else 
		 {
		   start++;
		 }
		 
		    
} 


Print Nodes in Top View of Binary Tree
 
       1
    /     \
   2       3
  /  \    / \
 4    5  6   7
Top view of the above binary tree is
4 2 1 3 7

        1
      /   \
    2       3
      \   
        4  
          \
            5
             \
               6
Top view of the above binary tree is
2 1 3 6
  
  
  
  
   class Stack 
   {
       
	  int start;
	  int end;
	  int mid;
      int arr [];
     
	 
	 
     Stack( int size)
	{
	   this.start = 0;
	   this.end = size-1;
	   this.mid = size/2;
	   this.arr = new int[size];
	}
    
    public  void push1 ( int a)

	{
       
	   if( start < mid)
	   {
	         arr[start] = a;
			 start++;
	   }
	}
	
 public  void push2 ( int a)

	{
       
	   if( end >  mid)
	   {
	         arr[end] = a;
			 end--;
	   }
	   
	}
	
	
	
	
	
 public int pop1 ()
	{
	   
	    int temp = arr[start];
		 start--;
	    return temp;
	}
	
 public int pop2 ()
	{
	   
	     int temp = arr[end];
		 end++;
	   
	   return temp;
	  
	  
	}
	
   }
  
  
 
  
  
     
  public void swap ( Node node,int val1 , int val2)
  {
  
       if(node == null || node.next == null )
	   {
	    
		return;
	   
	   }
	   
	   
	    
		if(searchValue(val1 , node))

       {
	    Node first  = search(val1 , node);
		Node prev1 = prev( node ,first );
	   
	   }     

       if(searchValue(val2 , node))

       {
	   
	   Node  second =  search(val2 , node);
	   Node prev2 = prev( node ,second );
	   } 
	
	    if( Node == first)
		{
		     node = second;
		}
		
		
		prev1.next = second;
		Node temp = seconde.next;
		second.next = first.next;
		prev2.next = first;
		first.next = temp;
        	
		
 
  
  }  
  
  
  public Node prev( Node node , Node first)
  {
    
     while( node.next != first )
	 {
	    
		 node = node.next;
	   
	 }
	 
	 return node;
  
  }
  
  
  
    
  public boolean searchvalue(int val)
  {
        
		while( node.next != null)
		{
		    
			 if( val == node.data)
			 {
			    
				return true;
			 
			 }
		   
		   node = node.next;
		}
		
	return false;
  
  }
  
  
  
  
  public Node search( int val , Node node)
  {
        
		while( node.next != null)
		{
		    
			 if( val == node.data)
			 {
			    
				return node;
			 
			 }
		   
		   node = node.next;
		}
		
		
  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 
 






































  */
		
		

	}

}
