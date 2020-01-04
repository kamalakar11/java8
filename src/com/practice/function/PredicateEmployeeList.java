package com.practice.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.practice.pojo.Employee;

public class PredicateEmployeeList {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(102, "Mahesh", 50000));
		empList.add(new Employee(101, "Samantha", 60000));
		empList.add(new Employee(105, "Vijay", 40000));
		empList.add(new Employee(100, "Rakul", 70000));
		empList.add(new Employee(106, "Nani", 45000));
		empList.add(new Employee(103, "Kajal", 65000));
		empList.add(new Employee(104, "Rashmika", 60000));
		
		Predicate<Employee> p = emp->emp.getSalary()>50000;
		
		for (Employee employee : empList) {
			if(p.test(employee)) {
				System.out.println(employee);
			}
		}
		System.out.println("-------------------------");
		Predicate<Employee> p2 = emp->emp.getName().length()%2==0;
		
		for (Employee employee : empList) {
			if(p2.test(employee)) {
				System.out.println(employee);
			}
		}
	}
}
