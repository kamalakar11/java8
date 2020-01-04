package com.practice.impl;

import java.util.ArrayList;
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
		System.out.println(empList);
	}
}
