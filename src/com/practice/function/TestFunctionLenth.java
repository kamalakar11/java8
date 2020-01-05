package com.practice.function;

import java.util.function.Function;

public class TestFunctionLenth {

	public static void main(String[] args) {
		Function<String, Integer> f1 = t->t.length();
		
		Function<String, String> f2 = t->t.toUpperCase();
		
		System.out.println(f1.apply("Rakul"));
		System.out.println(f2.apply("Rakul"));
	}
}
