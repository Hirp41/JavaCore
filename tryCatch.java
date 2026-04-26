package com.assignment.module1;

import java.util.Scanner;

public class tryCatch {
	
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Quoteint a: ");
		a=sc.nextInt();
		System.out.print("Enter Divident b: ");
		b=sc.nextInt();
		
		try {
			c=a/b;
			System.out.println("result of a/b: "+c);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("i am finally i will run always");
		}
		
	
	}

	
}