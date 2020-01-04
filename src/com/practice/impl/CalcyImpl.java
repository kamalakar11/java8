package com.practice.impl;

import com.practice.interf.ICalcy;

public class CalcyImpl implements ICalcy {

	@Override
	public int square(int n) {
		return n*n;
	}
}
