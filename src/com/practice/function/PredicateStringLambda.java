package com.practice.function;

import java.util.function.Predicate;

public class PredicateStringLambda {

	public static void main(String[] args) {
		Predicate<String> p = s-> (s==null || s.isEmpty());
		String name = "Rakul";
		String mail = "";
		System.out.println(p.test(name));
		System.out.println(p.test(mail));
	}
	
}
