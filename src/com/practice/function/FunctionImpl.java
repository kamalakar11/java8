package com.practice.function;

import java.util.function.Function;

public class FunctionImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		int l = t.length();
		return l;
	}

}
