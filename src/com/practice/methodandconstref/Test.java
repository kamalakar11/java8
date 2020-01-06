package com.practice.methodandconstref;

public class Test {

	public static void main(String[] args) {
		/*
		 * Runnable r = new Dog(); Thread t = new Thread(r); t.start();
		 */
//		Dog.doWork();

		Runnable r = Dog::doWork;

		Thread t = new Thread(r);
		t.start();

		for (int i = 11; i <= 20; i++) {
			System.out.println("Test work : " + i);
		}
	}
}
