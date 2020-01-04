package com.practice.impl;

import com.practice.interf.Interf;

public class TestLambda {

	public static void main(String[] args) {
		Interf i1 = ()->System.out.println("Good Morning from Lambda!!");
		
		i1.wishMe();
	}
}
