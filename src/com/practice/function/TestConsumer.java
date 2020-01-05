package com.practice.function;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		Consumer<String> c = s->System.out.println(s);
		
		c.accept("Rakul");
		c.accept("Ravi");
		c.accept("Vijay");
		c.accept("Kajal");
		
	}
}
