package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class Dog implements OtherFunction {

	@Override
	public void sing() {
		Solution.singCount ++ ;
		System.out.println("Woof, woof");
	}
}
