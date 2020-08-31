package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class Bird extends Animal implements OtherFunction {
	
	public Bird() {
		System.out.println("This is Bird");
		System.out.println("-------------");
	}

	void fly() {
		Solution.flyCount ++ ;
		System.out.println("I am flying");
	}

	@Override
	public void sing() {
		Solution.singCount ++ ;
		System.out.println("I am Singing ");
	}
}
