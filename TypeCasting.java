package com.assignment.module1;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Lets Perform Division");
		System.out.println("Enter A: ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter B : ");
		b=sc.nextInt();
		float c;
		c=a/b;
		System.out.println("Division Result without typecast : "+c);
		c=(float)a/(float)b;
		System.out.println("Division Result with typecast : "+c);
	}
}