package com.practice.function;

import java.util.function.Predicate;

public class TestPredicateImpl {

	public static void main(String[] args) {
		int a = 10;
		int b = 13;
		int c = 645;
		int d = 564;
		
//		System.out.println(testIsEven(a));
//		System.out.println(testIsEven(b));
//		System.out.println(testIsEven(c));
//		System.out.println(testIsEven(d));
//		System.out.println(testIsEven(453));
		Predicate<Integer> p = new PredicateImpl();
		System.out.println(p.test(a));
		System.out.println(p.test(b));
		System.out.println(p.test(c));
		System.out.println(p.test(d));
	}
	
	public static boolean testIsEven(int n) {
		if(n%2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
