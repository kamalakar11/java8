package com.practice.interfacejava8;

public interface Interf1 {
	public void m1();
	public void m2();
	default void m3() {
		System.out.println("default m3");
	}
}
