package com.practice.methodandconstref;

public class TestSampl {

	public static void main(String[] args) {
//		InterfSample i = new InterfSampleImpl();
		
		InterfSample i = Sample :: new;
		
		Sample sample = i.getSample();		
	}
}
