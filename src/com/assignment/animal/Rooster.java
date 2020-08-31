package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class Rooster implements OtherFunction {

	public Rooster() {
		System.out.println("This is Rooster");
		System.out.println("-------------");
	}
	
	@Override
	public void sing() {
		Solution.singCount ++ ;
		System.out.println("Cock-a-doodle-doo");
	}
}
