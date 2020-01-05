package com.practice.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import com.practice.pojo.Employee;

public class TestFuncationEmployeeList {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(102, "Mahesh", 50000));
		empList.add(new Employee(101, "Samantha", 60000));
		empList.add(new Employee(105, "Vijay", 40000));
		empList.add(new Employee(100, "Rakul", 70000));
		empList.add(new Employee(106, "Nani", 45000));
		empList.add(new Employee(103, "Kajal", 65000));
		empList.add(new Employee(104, "Rashmika", 60000));
		
		Function<Employee, Employee> f = emp->{
			double sal = emp.getSalary();
			sal = sal+ (sal*10)/100;
			emp.setSalary(sal);
			return emp;
		};
		
		Consumer<Employee> c = emp->System.out.println(emp);
		
		for (Employee e : empList) {
			c.accept(f.apply(e));
		}
		
		
	}
}
