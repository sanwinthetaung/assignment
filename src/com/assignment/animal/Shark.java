package com.assignment.animal;

public class Shark extends Fish {

	public Shark() {
		System.out.println("Shark are large and gray");
		System.out.println("Shark eat other fish");
	}
	
	@Override
	public void swim() {
		super.swim();
		Solution.swimCount ++ ;
	}
}
