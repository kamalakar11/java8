package com.practice.impl;

import com.practice.interf.ICalcy;

public class TestCalcyLambda {

	public static void main(String[] args) {
		ICalcy cal = n-> n*n;
		
		int res = cal.square(65);
		System.out.println("Square from lambda is : " + res);
	}
}
