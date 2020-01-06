package com.practice.methodandconstref;

public class TestAnimal {

	public static void main(String[] args) {
		IAnimal a = Cat::new;
		Cat c = a.getCat("tiger");
		
		System.out.println(c.getName());
	}
}
