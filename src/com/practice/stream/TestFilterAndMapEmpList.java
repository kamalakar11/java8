package com.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.practice.pojo.Employee;

public class TestFilterAndMapEmpList {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(102, "Mahesh", 50000));
		empList.add(new Employee(101, "Samantha", 60000));
		empList.add(new Employee(105, "Vijay", 40000));
		empList.add(new Employee(100, "Rakul", 70000));
		empList.add(new Employee(106, "Nani", 45000));
		empList.add(new Employee(103, "Kajal", 65000));
		empList.add(new Employee(104, "Rashmika", 60000));

		
		System.out.println(empList);
		List<Employee> richPeople = empList.stream().filter(e->e.getSalary()>50000).collect(Collectors.toList());
		System.out.println(richPeople);
		
		Function<Employee, Employee> f = e->{
			e.setSalary(e.getSalary()+10000);
			return e;
		};
		/*List<Employee> updatedEmpList = empList.stream().map(f).collect(Collectors.toList());
		System.out.println(updatedEmpList);*/
	
		Function<Employee, Employee> f2 = e->{
			e.setSalary(e.getSalary()-10000);
			return e;
		};
		
		List<Employee> richAfterLose = empList.stream().map(f2).filter(e->e.getSalary()>50000).collect(Collectors.toList());
		System.out.println(richAfterLose);
	}
}
