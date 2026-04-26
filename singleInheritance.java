package com.assignment.module1;


class carz{
	String Bname;
	int Warrenty1;
	
	public carz(String Bname,int Warrenty1) {
		this.Bname=Bname;
		this.Warrenty1=Warrenty1;
	}
	
	void display() {
		System.out.println("Brnad : "+Bname);
		System.out.println("Warrenty : "+Warrenty1);
	}
	
	
}

class model extends carz{

	String modelname;
	int mialage1;
	int price1;
	
	public model(String Bname, int Warrenty1 ,String modelname,int mialage1,int price1) {
		super(Bname, Warrenty1);
		this.modelname=modelname;
		this.mialage1=mialage1;
		this.price1=price1;
	}
	
	void diplaymodel() {
		System.out.println("model : "+modelname);
		System.out.println("mialage : "+mialage1);
		System.out.println("price "+price1+ " lakh");
	}
	
}
public class singleInheritance {
	
	public static void main(String[] args) {
		
		model Dzire = new model("Suzuki",5,"Dzire",16,6);
		Dzire.display();
		Dzire.diplaymodel();
		
		
	}

}