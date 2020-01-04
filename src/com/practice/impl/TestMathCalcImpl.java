package com.practice.impl;

import com.practice.interf.IMathCalc;

public class TestMathCalcImpl {

	public static void main(String[] args) {
		IMathCalc calc = new MathCalcImpl();
		calc.sum(10, 20);
		calc.sum(104, 208);
		calc.sum(156, 253);
	}
}
