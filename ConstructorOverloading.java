package com.assignment.module1;

class Car{
	
	String Brand;
	int Durablity;
	int milage;
	
	public Car() {
		System.out.println("This is Basic Car");
	}
	
	public Car(String Brand) {
		this.Brand=Brand;
		System.out.println("This is "+Brand+" car");
	}
	
	public Car(String Brand,int Durablity) {
		this.Brand=Brand;
		this.Durablity=Durablity;
		
		System.out.println("This is "+Brand+" car With "+Durablity+ " Year Durablity");
	}
	
	
	public Car(String Brand , int Durablity , int milage) {
		this.Brand=Brand;
		this.Durablity=Durablity;
		this.milage=milage;
		
		System.out.println("This is "+Brand+ " Car With "+Durablity+ " Year Durablity And "+milage+" Kmpl Milage");
		
	}
	 
	
}

public class ConstructorOverloding {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Audi");
		Car c3 = new Car("BMW",5);
		Car c4 = new Car("Volvo",6,12);
	}
}