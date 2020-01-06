package com.practice.methodandconstref;

public class TestInterf {

	public static void main(String[] args) {
		Practice p = new Practice();
		Interf i = p::add;
		i.sum(10, 30);
	}
}
