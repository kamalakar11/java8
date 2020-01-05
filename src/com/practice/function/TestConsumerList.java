package com.practice.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.practice.pojo.Employee;

public class TestConsumerList {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(102, "Mahesh", 50000));
		empList.add(new Employee(101, "Samantha", 60000));
		empList.add(new Employee(105, "Vijay", 40000));
		empList.add(new Employee(100, "Rakul", 70000));
		empList.add(new Employee(106, "Nani", 45000));
		empList.add(new Employee(103, "Kajal", 65000));
		empList.add(new Employee(104, "Rashmika", 60000));
		
		Consumer<Employee> c = emp->System.out.println(emp);
		
		Predicate<Employee> p = emp->emp.getSalary()>50000;
		
		Function<Employee, Employee> f1 = emp->{
			double salary = emp.getSalary();
			salary = salary+(salary*10)/100;
			emp.setSalary(salary);
			return emp;
		};
		
		Function<Employee, Employee> f2 = emp->{
			double salary = emp.getSalary();
			salary = salary+(salary*20)/100;
			emp.setSalary(salary);
			return emp;
		};
		
		for (Employee e : empList) {
			if(p.test(e))
				c.accept(f1.apply(e));
			else
				c.accept(f2.apply(e));
		}
		
	}
}
