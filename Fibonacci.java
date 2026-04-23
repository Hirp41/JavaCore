package com.assignment.module1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int firstTerm,secondterm,n=0;
		
		firstTerm=0;
		secondterm=1;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter n :");
		n=sc.nextInt();
		int nextTerm;
		for(int i=0; i<=n; i++) {
			
			
			System.out.print(firstTerm + ",");
			
			nextTerm=firstTerm+secondterm;
			firstTerm=secondterm;
			secondterm=nextTerm;
			
			
			
		}
		
		
		
	}
}