package com.assignment.animal;

public class ParrotWithRooster extends Rooster {

	public ParrotWithRooster() {
		System.out.println(" living with rooster");
		System.out.println("-------------");
	}
	
	@Override
	public void sing() {
		Solution.singCount ++ ;
		super.sing();
	}
}
