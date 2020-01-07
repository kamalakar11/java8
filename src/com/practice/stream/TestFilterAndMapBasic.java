package com.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilterAndMapBasic {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(23);
		l.add(25);
		l.add(16);
		l.add(27);
		l.add(18);
		l.add(22);
		l.add(7);
		
		System.out.println(l);
		
		List<Integer> evenList7 = new ArrayList<>();
		for (Integer n : l) {
			if(n%2==0)
				evenList7.add(n);
		}
		
		System.out.println(evenList7);
		
		List<Integer> evenList8 = l.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenList8);
		
		//sequential streams
		List<Integer> newList8 = l.stream().map(n->n+5).collect(Collectors.toList());
		System.out.println(newList8);
		
		//parallel streams
		List<Integer> newList82 = l.parallelStream().map(n->n+5).collect(Collectors.toList());
		System.out.println(newList82);
	}
}
