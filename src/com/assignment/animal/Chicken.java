package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class Chicken extends Animal implements OtherFunction {

	public Chicken() {
		System.out.println("This is Chicken");
		System.out.println("-------------");
	}
	
	@Override
	public void sing() {
		Solution.singCount ++ ;
		System.out.println("Cluck, cluck");
	}
	
	@Override
	void walk() {
		Solution.walkCount ++ ;
		System.out.println("I cannot fly");
	}

}
