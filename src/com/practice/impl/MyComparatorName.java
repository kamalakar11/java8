package com.practice.impl;

import java.util.Comparator;

import com.practice.pojo.Employee;

public class MyComparatorName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
