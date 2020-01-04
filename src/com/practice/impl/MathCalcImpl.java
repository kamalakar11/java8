package com.practice.impl;

import com.practice.interf.IMathCalc;

public class MathCalcImpl implements IMathCalc {

	@Override
	public void sum(int a, int b) {
		System.out.println("The sum from implementation is : " + (a+b));
	}

}
