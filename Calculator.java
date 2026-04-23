package com.assignment.module1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("************************************");
		System.out.println("Calculator");
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter a: ");
		a=sc.nextInt();
		System.out.print("Enter b: ");
		b=sc.nextInt();
		
		int key;
		boolean x=true;
		while(x) {
			
			System.out.println("-------------------------------------------");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Comparision");
			System.out.println("6.Mod");
			System.out.print("Which operation You Want To Perform : ");
			key=sc.nextInt();
			System.out.println();
			System.out.println("-------------------------------------------");
			
			
			
			switch (key) {
			case 1: {
				System.out.println("A+B : "+(a+b));
				break;
			}
			
			case 2: {
				System.out.println("A-B : "+(a-b));
				break;
			}
			
			case 3 : {
				System.out.println("AxB : "+(a*b));
				break;
			}
			case 4:{
				System.out.println("A/B : "+(a/b));
				break;
				
				}
			case 5:{
				if(a>b) {
					System.out.println("A is Greter than B");
					
				}
				else if(a==b) {
					System.out.println("A and B are equal");
				}
				else {
					System.out.println("A is less than B");
					
				}
				break;
				}
			case 6:{
				System.out.println("A mod B : "+(a%b));
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " );
			}

			
			
		}
		
		
		
		
		
	}
}