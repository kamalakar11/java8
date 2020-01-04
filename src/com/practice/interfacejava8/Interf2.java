package com.practice.interfacejava8;

public interface Interf2 {

	public static final int a = 10;
	public void m1();
	
	default void m2() {
		System.out.println("Interf2 m2 method!!");
	}
}
