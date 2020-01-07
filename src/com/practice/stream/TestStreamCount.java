package com.practice.stream;

import java.util.ArrayList;
import java.util.List;

import com.practice.pojo.Employee;

public class TestStreamCount {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(102, "Mahesh", 50000));
		empList.add(new Employee(101, "Samantha", 60000));
		empList.add(new Employee(105, "Vijay", 40000));
		empList.add(new Employee(100, "Rakul", 70000));
		empList.add(new Employee(106, "Nani", 45000));
		empList.add(new Employee(103, "Kajal", 65000));
		empList.add(new Employee(104, "Rashmika", 60000));
		
		int count = 0;
		for (Employee e : empList) {
			if(e.getSalary()>50000) {
				count++;
			}
		}
		
		System.out.println(count);
		
		long c = empList.stream().filter(e->e.getSalary()>50000).count();
		System.out.println("java8 count : " + c);
	}
}
