package com.practice.methodandconstref;

public class Cat {

	private String name;

	Cat(String name) {
		System.out.println("cat object created!!");
		this.name = "Mr." + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
