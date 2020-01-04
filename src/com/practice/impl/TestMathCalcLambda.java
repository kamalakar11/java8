package com.practice.impl;

import com.practice.interf.IMathCalc;

public class TestMathCalcLambda {

	public static void main(String[] args) {
		IMathCalc calc = (a,b) -> System.out.println("Sum is from lambda : " + (a+b));
		calc.sum(10, 20);
		calc.sum(104, 208);
		calc.sum(156, 253);
	}
}
