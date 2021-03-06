package com.practice.impl;

import com.practice.interf.IMathCalc;

public class TestMathCalcAnounymousInner {

	public static void main(String[] args) {
		IMathCalc calc = new IMathCalc() {
			@Override
			public void sum(int a, int b) {
				System.out.println("Sum is from anounymous innerclass : " + (a+b));
			}
		};
		
		calc.sum(10, 20);
		calc.sum(104, 208);
		calc.sum(156, 253);
	}
}
