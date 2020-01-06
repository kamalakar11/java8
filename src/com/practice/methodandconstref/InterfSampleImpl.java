package com.practice.methodandconstref;

public class InterfSampleImpl implements InterfSample {

	@Override
	public Sample getSample() {
		System.out.println("Creating sample class objcet!!");
		Sample s = new Sample();
		return s;
	}

	
}
