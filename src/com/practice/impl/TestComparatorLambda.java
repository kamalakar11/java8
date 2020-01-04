package com.practice.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparatorLambda {

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
		
		Collections.sort(l, (o1,o2)->o2-o1);
		System.out.println(l);
	}
}
