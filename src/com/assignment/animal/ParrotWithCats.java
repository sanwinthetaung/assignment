package com.assignment.animal;

public class ParrotWithCats extends Cat {

	public ParrotWithCats() {
		System.out.println("This is Parrot; living with cats");
		System.out.println("-------------");
	}
	
	@Override
	public void sing() {
		Solution.singCount ++ ;
		super.sing();
	}
	
}
