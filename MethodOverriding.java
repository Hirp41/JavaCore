package com.assignment.module1;

class parent{
	
	parent(){
		System.out.println("parent Constructor called");
	}
	void shows() {
		System.out.println("I am Parent");
	}
	
}

class child extends parent{
	
	child(){
		super();
		
	}
	
	void shows() {
		
		super.shows();
		
		System.out.println("I am child");
	}
	
}

public class MethodOveridingAsignment {
	
	public static void main(String[] args) {
		
		child p1 = new child();
		p1.shows();
	}

}