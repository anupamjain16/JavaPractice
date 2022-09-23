package test;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test324234 {

	
	/// Stream api use for get occurnce of each char in map.
	public static void main(String[] args) {

		String str = "this is this is my name";
		
		

		Map<String, Long> charCount = str.chars().mapToObj(c -> Character.toString((char) c))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		
		
		
		
		System.out.println(charCount);
		System.out.println(str.chars().spliterator().characteristics());
		
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
      System.out.print(a == c.intern());    true    
      
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
	  
	  @profile
	  
	  emp
	  
	  
	  
	  Print the Fname, Lname from 3rd to 6th tuple of Employee table when sorted according to the Salary.
	  
	  
	  
	  select Fname, Lname
	  from emp
	  order by salary 
	  where rownum in between 3 and 6; offset
	  
	  
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
  
  
   string str = "I am happy Today. Today is my happy day"
  
  
  
   Bruteforce - 
    
	
	
	 
	 
	  Stream.of()
	  
	  Arrays.Strean(arr). 
	 
	 for ( int i = 0 ; l > arr.lenght ; i++)
	    
		count ++;
	     for ( int j = i+1 ; j > arr.lenght ; j++)
	   
	       if (arr[i] == arr[j])
		   {
		      count++;
		   }
	    Sysout ( "word :" = arr[i] + "counts is " + count) 
    
	
	
	-- o n2
  
      int arr[] = str.split(" ");
      map = new hashmap();
	   
	for ( int i = 0 ; l > arr.lenght ; i++)
	   {
	        if (map.containsKey(arr[i]))
			{
			     map.put( map.get() , )   
			}
			else
			{
			      
			}
	   
	   
	   }

	  
	  
	  10 
      	  
	  
	  
	  
	  
	  
     
    
    print x no of prime no in given range og y and z
	
	 
	  int start = y;
	  int end = z;
	  int count = x;
	  
	 int arr2[] = printprime(y,z);
	  
	 
	  for ( int i = 0 ; i < x ; i++ )
		{
		  Sysout (arr[i]);
		}
		  
	 
	 //edge case   - (0 , 0)  - 0 , 1 , 0 , 3,  ( 2 ,6)
	 
	 
	public static int[] printPrime( int y ,  int z)
	
	{
	
	     int index = 0;
	     int arr[] = new int[z-y+1];
		 
	   
	    
	    for ( int i = y ; i < z ; i++ )
		{
		       if (i%2 !=0)
			   {
			         arr[index] = i; 
					 index++;
			   }
		}
	
	return arr;
	}
	
	
	

   
    	

	  
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
 
 
 
 
 @autowire
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
	
	select name 
	from customer left outer join  order on
	customer.customer_id = order_id.customer_id
	where O.CustomerId is NULL ;

 
 SELECT C.Name FROM Customers C LEFT JOIN Orders O ON C.Id = O.CustomerId WHERE O.CustomerId is NULL.
 
 

2. write sql to get those customer who have placed order in the current month

      
	  select customer_id
	  from order
	  where  todate(order_date, "mmm" )  = todate(System.date, mmm );
	  


write a sql query to get the list of  employees who have their birthdays today

 
 select name 
 from employee
 where to_date(dob , yyyy/mm/dd) = todate(SYSdate, yyyy/mm/dd);
 




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
You must write an algorithm with O(log n) runtime complexity.




 list.stream.flatmap(list -> list.stream).sorted()
  
  class shortbyAge implement corator
{


   public comareto( o1 ,o2)
   {
      return o2.age - o1.age;
   }

 class shortbyName implement comprator
{


   public comareto( o1 ,o2)
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
 
 
   class stundet implement comprable
   
   {  
   
    String name;
   
   @override
   public stundet compare(Student s2)
    {
	   return  (s2.name);
	}   
   
   }
 
  
  */
		
		

	}

}
