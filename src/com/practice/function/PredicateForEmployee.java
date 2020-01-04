package com.practice.function;

import java.util.function.Predicate;

import com.practice.pojo.Employee;

public class PredicateForEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Rakul", 70000);
		Employee e2 = new Employee(102, "Kajal", 65000);
		Employee e3 = new Employee(103, "Vijay", 60000);
		
		Predicate<Employee> p = emp->emp.getSalary()>65000;
		
		System.out.println(p.test(e1));
		System.out.println(p.test(e2));
		System.out.println(p.test(e3));
	}
}
