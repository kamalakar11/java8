package com.practice.function;

import java.util.function.Predicate;

public class TestPredicateLambda {

	public static void main(String[] args) {
		Predicate<Integer> p = n->n%2==0;
		
		System.out.println(p.test(10));
		System.out.println(p.test(45));
		System.out.println(p.test(587));
		System.out.println(p.test(654));
	}
}
