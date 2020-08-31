package com.assignment.animal;

import com.assignment.functions.FlyFunction;
import com.assignment.functions.OtherFunction;

public class Butterfly extends Animal implements OtherFunction, FlyFunction {

	@Override
	public void sing() {
		Solution.singCount ++ ;
		System.out.println("Butterfly make so sound");
	}
	
	@Override
	public void fly() {
		Solution.flyCount ++ ;
		System.out.println("Butterfly can fly");
	}
}
