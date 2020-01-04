package com.practice.impl;

import com.practice.interf.ICalcy;

public class TestCalcyImpl {

	public static void main(String[] args) {
		ICalcy cal = new CalcyImpl();
		int res = cal.square(65);
		System.out.println("The square from impl is : " + res);
	}
}
