package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestArrayStream {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(43);
		l.add(23);
		l.add(4);
		l.add(26);
		l.add(23);
		l.add(6);
		l.add(23);
		l.add(6);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$4");
		int[] a = {12, 34, 54, 23, 76, 3, 13};
		int[] b = Arrays.stream(a).filter(n->n%2==0).toArray();
		Arrays.stream(b).forEach(System.out::println);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%55");
		l.forEach(System.out::println);
	}
}
