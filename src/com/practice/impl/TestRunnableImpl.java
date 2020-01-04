package com.practice.impl;

public class TestRunnableImpl {

	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		for(int i=11; i<=20; i++) {
			System.out.println("Parent Thread : " + i);
		}
	}
}
