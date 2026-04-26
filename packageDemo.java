package com.assignment.module1;
import java.util.Scanner;

import com.assignment.module1.*;

public class packagedemo {
	public static void main(String[] args) {
		System.out.println("lets use the method define in another program via importing class in same package");
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three No : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int result =findmaximum.Compare(a,b,c);
		System.out.println("Max of Three : "+result);
		
		
		
	}

}