package com.practice.function;

import java.util.function.Predicate;

public class TestPredicateAnonymous {

	public static void main(String[] args) {
		Predicate<Integer> p = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		
		System.out.println(p.test(10));
		System.out.println(p.test(45));
		System.out.println(p.test(587));
		System.out.println(p.test(654));
	}
}
