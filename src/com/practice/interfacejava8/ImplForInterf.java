package com.practice.interfacejava8;

public class ImplForInterf implements Interf2, Interf3 {
	public static final int a = 50;
	@Override
	public void m1() {
		System.out.println("impl m1 done!!");
	}
	
	@Override
	public void m2() {
		Interf3.super.m2();
	}

	public static void main(String[] args) {
		System.out.println(Interf2.a);
		System.out.println(Interf3.a);
		System.out.println(a);
		ImplForInterf i = new ImplForInterf();
		i.m2();
	}
}
