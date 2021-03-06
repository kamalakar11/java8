package com.practice.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.practice.pojo.Employee;

public class TestComparatorEmployeeLambda {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(102, "Mahesh", 50000));
		empList.add(new Employee(101, "Samantha", 60000));
		empList.add(new Employee(105, "Vijay", 40000));
		empList.add(new Employee(100, "Rakul", 70000));
		empList.add(new Employee(106, "Nani", 45000));
		empList.add(new Employee(103, "Kajal", 65000));
		empList.add(new Employee(104, "Rashmika", 60000));
		
//		empList.forEach(System.out::println);
//		Collections.sort(empList, (e1,e2)->e2.getEmpId()-e1.getEmpId());//sort based on empId in descending order
		
//		Collections.sort(empList, (e1,e2)->e2.getName().compareTo(e1.getName()));
		
		Collections.sort(empList, new MyComparatorName());
		
//		Collections.sort(empList,(e1,e2)->(int)(e2.getSalary()-e1.getSalary())); 
		
		for (Employee employee : empList) {
			System.out.println(employee);
		}
//		System.out.println(empList);
	}
}
