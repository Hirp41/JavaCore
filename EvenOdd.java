package com.assignment.module1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int a;
		System.out.print("Enter Any No : ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Entered No is Even");
		}
		else {
			System.out.println("Entered no is Odd");
		}
		
	}
}