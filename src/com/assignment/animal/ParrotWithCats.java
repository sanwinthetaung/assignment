package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class ParrotWithCats  extends Animal implements OtherFunction {

	public ParrotWithCats() {
		System.out.println("This is Parrot; living with cats");
		System.out.println("-------------");
	}
	
	@Override
	public void sing() {
		System.out.println("Meow");
	}
	
}
