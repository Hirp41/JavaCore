package com.assignment.module1;

import java.util.Scanner;

class EmpSystem{
	static {
		System.out.println("Welcome");
	}
}

class Emp{
	
	
	static String Project = "Java";
	static int No_Emp = 10;
	
	public static void Hire_Emp() {
		No_Emp++;
	}
	
	public static void Fire_Emp() {
		No_Emp--;
	}
	
	
}

public class StaticDemo {
	
	public static void main(String[] args) {
		
		EmpSystem e1 = new EmpSystem();
		
		boolean x=true;
		Scanner sc =new Scanner(System.in);
		int key;
		
		
		while(x){
			System.out.println("-----------------------------");
			System.out.println("Menu");
			System.out.println("1. know Project Name");
			System.out.println("2.know Current no of employe ");
			System.out.println("3.Hire Employee");
			System.out.println("4.Fire Employee");
			System.out.println("5.Exit");
			System.out.println("----------------------------");
			System.out.print("Enter your Choice : ");
			key = sc.nextInt();
			
			
			switch (key) {
			case 1: {
				System.out.println("Project Name : "+Emp.Project);
				break;
			}
			case 2:{
				System.out.println("No Of Employee :  "+Emp.No_Emp);
				break;
			}
			case 3:{
				Emp.Hire_Emp();
				System.out.println("Hired New Employee ");
				System.out.println("Updated No Of Employee :  "+Emp.No_Emp);
				break;
			}
			case 4:{
				Emp.Fire_Emp();
				System.out.println("fired Employe ");
				System.out.println("Updated No Of Employee :  "+Emp.No_Emp);
				break;
				
			}
			case 5:{
				System.out.println("Thanks for using Employee Management system");
				x=false;
				break;
			}
		
					
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		}
	}

}