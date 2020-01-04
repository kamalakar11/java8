package com.practice.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparatorStringLambda {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Rashmika");
		l.add("Rakul");
		l.add("Samantha");
		l.add("Kajal");
		l.add("Vijay");
		l.add("Nani");
		l.add("Mahesh");
		
//		Collections.sort(l, (s1,s2)->s1.length()-s2.length()); // Based on number of characters descending order
		
//		Comparator<String> comp = (s1, s2)->s2.compareTo(s1); //Based on alphabetical order descending.
		
		Collections.sort(l, (s1, s2)->s2.compareTo(s1));
		System.out.println(l);
		
	}
}
