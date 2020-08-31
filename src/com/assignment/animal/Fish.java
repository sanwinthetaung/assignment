package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class Fish extends Animal implements OtherFunction {
	
	public Fish() {
		System.out.println("This is Fish");
		System.out.println("-------------");
	}

	@Override
	public void sing() {
		System.out.println("Fish don't sing");
	}
	
	@Override
	void walk() {
		System.out.println("Fish don't walk");
	}
	
	void swim() {
		System.out.println("Fish can swim");
	}
}
