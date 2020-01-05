package com.practice.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.practice.pojo.Employee;

public class ConsumerMethod {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(102, "Mahesh", 50000));
		empList.add(new Employee(101, "Samantha", 60000));
		empList.add(new Employee(105, "Vijay", 40000));
		empList.add(new Employee(100, "Rakul", 70000));
		empList.add(new Employee(106, "Nani", 45000));
		empList.add(new Employee(103, "Kajal", 65000));
		empList.add(new Employee(104, "Rashmika", 60000));
		
		Consumer<Employee> c = emp->{
			System.out.println("Employee id is : " + emp.getEmpId());
			System.out.println("Employee name is : " + emp.getName());
			System.out.println("Employee salary is : " + emp.getSalary());
		};
		
		Consumer<Employee> c2 = s->System.out.println("-----------------------------");
		
		for (Employee employee : empList) {
			c2.andThen(c).accept(employee);
		}
	}
}
