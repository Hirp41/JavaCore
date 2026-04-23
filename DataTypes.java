package com.assignment.module1;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Boolean A;
		System.out.println("Boolean Data Type");
		System.out.print("Enter True or False : ");
		A=sc.nextBoolean();
		System.out.println("enterd boolean is : "+A);
		
		
		char c;
		System.out.println("Char Data Type");
		System.out.print("Enter Any Character : ");
		c=sc.next().charAt(0);
		System.out.println("Enteres Char is: "+c);
		//there is no direct method to read char in java
		
		int a;
		System.out.println("Integer Data Type (32 bit Signed int )");
		System.out.print("Enter Any interger :");
		a=sc.nextInt();
		System.out.println("Entered Int is : "+a);
		
		
		short b;
		System.out.println("Short Data type (16 bit signed int)");
		System.out.print("Enter any integer : ");
		b=sc.nextShort();
		System.out.println("Entered integer is : "+b);
		
		long l;
		System.out.println("Long Data Type (64 bit Sigend int) ");
		System.out.print("Enter any big integer : ");
		l=sc.nextLong();
		System.out.println("Entered long l is : "+l);
		
		float f;
		System.out.println("Float Data Type ");
		System.out.println("Enter any Float Vale : ");
		f=sc.nextFloat();
		System.out.println("Entered float is "+f);
		
		double d;
		System.out.println("Enter Any Float value (64 bit)");
		System.out.println("Enter Any Float : ");
		d=sc.nextDouble();
		System.out.println("Entered Double is "+d);
		
		String s;
		System.out.println("String Data type");
		System.out.println("Enter Any String : ");
		s=sc.next();
		System.out.println("Entered String is : "+s);
		
		int[] x = new int[5];
		System.out.println("Array data Type");
		System.out.println("Enter 5 Array Element");
		for(int i=0; i<5; i++) {
			
			System.out.print("Enter Array Element"+i+":");
			x[i]=sc.nextInt();
		}
		for(int i=0; i<5; i++) {
			
			System.out.println("Entered Array Element "+i+" is "+x[i]);
			
		}
		
	}

}