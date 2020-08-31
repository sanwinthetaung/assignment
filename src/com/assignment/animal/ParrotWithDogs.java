package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class ParrotWithDogs extends Animal implements OtherFunction {

	public ParrotWithDogs() {
		System.out.println("This is Parrot; living with dogs");
		System.out.println("-------------");
	}
	
	@Override
	public void sing() {
		System.out.println("Woof, woof");
	}
	
	

}

