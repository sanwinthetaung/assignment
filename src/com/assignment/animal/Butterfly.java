package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class Butterfly extends Animal implements OtherFunction {

	@Override
	public void sing() {
		System.out.println("Butterfly make so sound");
	}
	
	@Override
	void walk() {
		System.out.println("Butterfly can fly");
	}
}
