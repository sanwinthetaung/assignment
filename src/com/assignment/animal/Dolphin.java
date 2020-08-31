package com.assignment.animal;

import com.assignment.functions.SwimFunction;

public class Dolphin extends Animal implements SwimFunction {
	
	public Dolphin() {
		System.out.println("This is Dolphin");
	}

	@Override
	public void swim() {
		Solution.swimCount ++ ;
		System.out.println("Dolphins are good swimmer.");
	}

}
