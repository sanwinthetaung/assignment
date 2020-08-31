package com.assignment.animal;

import com.assignment.functions.OtherFunction;
import com.assignment.functions.SwimFunction;

public class Fish extends Animal implements SwimFunction, OtherFunction {
	
	public Fish() {
		System.out.println("This is Fish");
		System.out.println("-------------");
	}

	@Override
	public void sing() {
		Solution.singCount ++ ;
		System.out.println("Fish don't sing");
	}
	
	@Override
	void walk() {
		Solution.walkCount ++ ;
		System.out.println("Fish don't walk");
	}
	
	@Override
	public void swim() {
		Solution.swimCount ++ ;
		System.out.println("Fish can swim");
	}
	
	
}
