package com.practice.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparatorImpl {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(45);
		l.add(23);
		l.add(2);
		l.add(87);
		l.add(12);
		l.add(95);
		l.add(12);
		l.add(17);
		
		Collections.sort(l, new MyComparator());
		
		System.out.println(l);
	}
}
