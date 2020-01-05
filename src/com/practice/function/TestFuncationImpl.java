package com.practice.function;

import java.util.function.Function;

public class TestFuncationImpl {

	public static void main(String[] args) {
		Function<String, Integer> f = new FunctionImpl();
		
		System.out.println(f.apply("Rakul Preet Singh"));
	}
}
