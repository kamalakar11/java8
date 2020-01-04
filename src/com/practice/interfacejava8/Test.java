package com.practice.interfacejava8;

public class Test {

	public static void main(String[] args) {
		Interf1 i1 = new InterfImpl();
		i1.m1();
		i1.m2();
		i1.m3();
		
		Interf3 i2 = new ImplForInterf();
		i2.m1();
	}
}
