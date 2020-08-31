package com.assignment.animal;

public class Solution {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		System.out.println("________________");
		
		Duck duck = new Duck();
		duck.walk();
		duck.sing();
		
		System.out.println("________________");
		
		Chicken chicken = new Chicken();
		chicken.walk();
		chicken.sing();
		
		System.out.println("________________");
		
		
	}

}
