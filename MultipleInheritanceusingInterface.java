package com.assignment.module1;

interface project{
	
	default void employee() {
		System.out.println("only Default method implemntation is allowed in interface");
	} 
	void hireEmployee();
	void fireEmployee();
	void ShowProject();
	void holdproject();
	
}

interface Fund{
	void raiseFund();
	void investFund();
	
}

class javaproject implements project,Fund{

	int fund;
	int investment;
	int empl;
	public void raiseFund() {
		fund++;
		System.out.println("Current avl Fund : "+fund);
	}

	
	public void investFund() {
		if(fund!=0) {
			fund--;
			investment++;
			System.out.println("Current invested Fund : "+investment);
		}
		else {
			System.out.println("Insufficient fund");
		}
		
		
	}

	
	public void hireEmployee() {
		empl++;
		System.out.println("Current no of employee : "+empl);
		
	}

	
	public void fireEmployee() {
		empl--;
		System.out.println("Current no of employee : "+empl);
		
	}

	
	public void ShowProject() {
		System.out.println("project is Shown");
		
	}

	
	public void holdproject() {
		System.out.println("project is on hold now");
		
	}
	
}


public class MultipleInheritnceusinginterface {
	public static void main(String[] args) {
		javaproject j1 = new javaproject();
		j1.employee();
		j1.hireEmployee();
		j1.hireEmployee();
		j1.fireEmployee();
		j1.holdproject();
		j1.raiseFund();
		j1.raiseFund();
		j1.investFund();
		j1.investFund();
		j1.investFund();
	}

}