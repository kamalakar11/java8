package com.practice.impl;

public class TestRunnableAnonymous {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					System.out.println("Child Thread : " + i);
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=11; i<=20; i++) {
			System.out.println("Parent Thread : " + i);
		}
	}
}

