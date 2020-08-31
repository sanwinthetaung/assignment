package com.assignment.animal;

public class Dolphin extends Animal   {
	
	public Dolphin() {
		System.out.println("This is Dolphin");
	}

	@Override
	void walk() {
		System.out.println("Dolphins are good swimmer.");
	}

}
