package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class Chicken extends Animal implements OtherFunction {

	public Chicken() {
		System.out.println("This is Chicken");
		System.out.println("-------------");
	}
	
	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}
	
	@Override
	void walk() {
		System.out.println("I cannot fly");
	}

}
