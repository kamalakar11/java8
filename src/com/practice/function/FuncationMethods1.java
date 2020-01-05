package com.practice.function;

import java.util.function.Function;

public class FuncationMethods1 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = n->n*n;
		
		Function<Integer, Integer> f2 = n->n*n*n;
		
		Function<Integer, Integer> f3 = n->n+10;
		
		System.out.println(f1.apply(24));
		System.out.println(f1.apply(67));
		
		System.out.println(f2.apply(25));
		System.out.println(f2.apply(7));
		
		System.out.println(f3.apply(25));
		System.out.println(f3.apply(7));
		
		System.out.println(f3.andThen(f1).apply(45));
		System.out.println(f1.andThen(f3).apply(45));
		System.out.println(f3.compose(f1).apply(45));
	}
}
