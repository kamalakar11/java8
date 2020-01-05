package com.practice.function;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

import com.practice.pojo.Employee;

public class TestSupplier {

	public static void main(String[] args) throws InterruptedException {
		Supplier<Date> s = ()->new Date();
		
		System.out.println(s.get());
		Thread.sleep(3000);
		System.out.println(s.get());
		
		Supplier<List<Employee>> s2 = ()->{
			List<Employee> empList = new ArrayList<Employee>();
			empList.add(new Employee(102, "Mahesh", 50000));
			empList.add(new Employee(101, "Samantha", 60000));
			empList.add(new Employee(105, "Vijay", 40000));
			empList.add(new Employee(100, "Rakul", 70000));
			empList.add(new Employee(106, "Nani", 45000));
			empList.add(new Employee(103, "Kajal", 65000));
			empList.add(new Employee(104, "Rashmika", 60000));
			
			return empList;
		};
		
		for (Employee e : s2.get()) {
			System.out.println(e);
		}
		
	}
}
