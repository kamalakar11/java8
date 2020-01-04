package com.practice.interfacejava8;

public interface Interf3 {

	int a = 40;
	public void m1();
	
	default void m2() {
		System.out.println("Interf3 m2 method!!");
	}
}
