package com.practice.impl;

import com.practice.interf.Interf;

public class TestAnonymousInner {

	public static void main(String[] args) {
		Interf i1 = new Interf() {
			@Override
			public void wishMe() {
				System.out.println("Good Morning from annonymous innerclass!!");
			}
		};
		
		i1.wishMe();
	}
}
