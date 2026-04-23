package com.assignment.module1;
import java.util.Scanner;

import Basic.*;

class math{
	private int a=8;
	protected int b=7;
	public int c=9;
	int x=20;
	
	protected void show() {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("d: "+x);
	}
	
	public void square() {
		System.out.println("Square of a : "+(a*a));
		System.out.println("cube method is private so it cant called by object so i am calling");
		cube();
	}
	
	private void cube() {
		System.out.println("Cube of a: "+(a*a*a));
	}
	
	 
}

class school extends math{
	void displayVar() {
		System.out.println("a is not accesible as it private");
		System.out.println("b is accesible as it protected and we inherit math : "+b);
		System.out.println("c is public so anywhwere accssible "+c);
		System.out.println("x is default so everywhere accesible "+x);
		boolean b;
		Scanner sc = new Scanner(System.in);
		System.out.print("if you want to access another package variable write True : ");
		b=sc.nextBoolean();
		if(b) {
			System.out.println("Magic :  "+Sample.demo);
		}
		
		
		
	}
}

public class Accessmodifiers {

	public static void main(String[] args) {
		math m = new math();
		school s = new school();
		
		m.show();
		m.square();
		s.displayVar();
	}
}