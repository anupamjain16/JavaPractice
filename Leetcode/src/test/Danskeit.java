package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Danskeit {

	public static void main(String[] args) {

		// Q print
		String str = "aba";

		char[] ch = str.toCharArray();

		int i = 0;
		int N = 10;

		while (str.length() < N) {
			str = str + ch[i];
			i++;
			if (i == ch.length) {
				i = 0;
			}
		}

		System.out.println(str);

		int res = Integer.MAX_VALUE;

		System.out.println(res);

		res = Integer.MIN_VALUE;

		System.out.println(res);

		List<Employee> list = new LinkedList<>();
		list.add(new Employee(2l, "Lokesh", "Gupta"));
		list.add(new Employee(1l, "Alex", "Gussin"));
		list.add(new Employee(4l, "Brian", "Sux"));
		list.add(new Employee(5l, "Neon", "Piper"));
		list.add(new Employee(3l, "David", "Beckham"));
		list.add(new Employee(7l, "Alex", "Beckham"));
		list.add(new Employee(6l, "Brian", "Suxena"));

		List<Employee> sortedEmployees2 =

				list.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId))
						.collect(Collectors.toList());

		System.out.println(sortedEmployees2.toString()); 
	}

}
