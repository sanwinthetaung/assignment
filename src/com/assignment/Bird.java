package com.assignment;

public class Bird extends Animal implements OtherFunction {

	void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void sing() {
		System.out.println("I am Singing ");
	}
}
