package com.practice.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMethods {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(23);
		l.add(56);
		l.add(34);
		l.add(53);
		l.add(12);
		l.add(67);
		l.add(278);
		
		Predicate<Integer> p1 = n->n%2==0;
		
		for (Integer n : l) {
			if(p1.test(n))
				System.out.println(n);
		}
		
		System.out.println("-------------------");
		for (Integer n : l) {
			if(p1.negate().test(n))
				System.out.println(n);
		}
	}
}
