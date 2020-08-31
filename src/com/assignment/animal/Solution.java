package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class Solution {
	
	public static int flyCount  = 0;
	public static int swimCount = 0;
	public static int walkCount = 0;
	public static int singCount = 0;

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
		
		// Rooster related with chicken by interface
		OtherFunction rooster = new Rooster();
		rooster.sing();
		
		System.out.println("________________");
		
		ParrotWithDogs parrotWithDogs = new ParrotWithDogs();
		parrotWithDogs.sing();
		
		System.out.println("________________");
		
		ParrotWithCats parrotWithCats = new ParrotWithCats();
		parrotWithCats.sing();
		
		System.out.println("________________");
		
		ParrotWithRooster parrotWithRooster = new ParrotWithRooster();
		parrotWithRooster.sing();
		
		System.out.println("________________");
		
		Fish fish = new Fish();
		fish.walk();
		fish.swim();
		fish.sing();
		
		System.out.println("________________");
		
		Fish shark = new Shark();
		shark.swim();
		System.out.println("________________");
		
		Fish clownFish = new ClownFish();
		clownFish.swim();
		System.out.println("________________");
		
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		System.out.println("________________");
		
		Butterfly butterfly = new Butterfly();
		butterfly.sing();
		butterfly.walk();
		System.out.println("________________");
		
		
		
		Solution.showCount();
	}
	
	static void showCount() {
		System.out.println("swim count " + swimCount);
		System.out.println("fly count " + flyCount);
		System.out.println("walk count " + walkCount);
		System.out.println("sing count " + singCount);
	}

}
