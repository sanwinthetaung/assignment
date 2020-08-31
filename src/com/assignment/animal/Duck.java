package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class Duck extends Animal implements OtherFunction {

	public Duck() {
		System.out.println("This is Duck");
		System.out.println("-------------");
	}
	
	@Override
	public void sing() {
		Solution.singCount ++ ;
		System.out.println("Quack, quack");
	}
	
	@Override
	void walk() {
		Solution.walkCount ++ ;
		System.out.println("I can swin");
	}

}
