package com.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.pojo.Employee;

public class TestStreamSorted {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(102, "Mahesh", 50000));
		empList.add(new Employee(101, "Samantha", 60000));
		empList.add(new Employee(105, "Vijay", 40000));
		empList.add(new Employee(100, "Rakul", 70000));
		empList.add(new Employee(106, "Nani", 45000));
		empList.add(new Employee(103, "Kajal", 65000));
		empList.add(new Employee(104, "Rashmika", 60000));
		
		List<Employee> sl = empList.stream().sorted((e1,e2)->e2.getName().compareTo(e1.getName())).collect(Collectors.toList());
		sl.stream().forEach(System.out::println);
		
		List<Integer> l = new ArrayList<>();
		l.add(43);
		l.add(23);
		l.add(4);
		l.add(26);
		l.add(23);
		l.add(6);
		l.add(23);
		l.add(6);
		
		/*List<Integer> slist = l.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println(slist);*/
		
		Integer minValue = l.stream().min((a,b)->b-a).get();
		System.out.println(minValue);
		
		Integer maxValue = l.stream().max((a,b)->a-b).get();
		System.out.println(maxValue);
		System.out.println("---------------------------");
		l.stream().forEach(n->System.out.print(n+","));
//		l.stream().forEach(System.out::println);
	}
}
