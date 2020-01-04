package com.practice.impl;

import com.practice.interf.ICalcy;

public class TestCalcyAnonymousInner {

	public static void main(String[] args) {
		ICalcy cal = new ICalcy() {
			@Override
			public int square(int n) {
				return n*n;
			}
		};
		
		int res = cal.square(65);
		System.out.println("The square from anonymous innerclass is : " + res);
	}
}
