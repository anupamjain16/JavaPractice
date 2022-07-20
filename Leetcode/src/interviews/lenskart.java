package interviews;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lenskart {
	/*
	 * 
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 

and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 

To accommodate this, nums1 has a length of m + n, where the first m elements 
denote the elements that should be merged, and the last n ele

	List<Student> List2 = 	list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	
	List<Employee> listSorted = new ArrayList<Employee>();
            Comparator<Employee>  NameCommparator = Comparator.comparing(Employee::getName);
            listSorted = list.stream().sorted(NameCommparator).collect(Collectors.toList());

            System.out.println(listSorted);

//sorting on descending order
            Comparator<Employee>  SalaryCommparator = Comparator.comparing(Employee::getSalary);
            listSorted = list.stream().sorted(SalaryCommparator.reversed()).collect(Collectors.toList());
            System.out.println(listSorted);


	 */

}
