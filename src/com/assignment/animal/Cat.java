package com.assignment.animal;

import com.assignment.functions.OtherFunction;

public class Cat implements OtherFunction {

	@Override
	public void sing() {
		Solution.singCount ++ ;
		System.out.println("Meow");
	}
}
