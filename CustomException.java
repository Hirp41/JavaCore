package com.assignment.module1;

class insuffFund extends Exception{

	public insuffFund(String message) {
		super(message);
	}
	
}

class bank {
	int balance=1000;
	int withdrawalReq;
	int depositReq;
	
	void deposit(int depositReq) {
		this.depositReq=depositReq;
		balance=balance+depositReq;
	}
	
	void withdrawal(int withdrawalReq) throws insuffFund{
		if(withdrawalReq>balance) {
			throw new insuffFund("Insufficient Fund");
		}
		else {
			System.out.println("Colllect ur money");
		}
	}
}
public class CustomExecption {
	public static void main(String[] args) {
		bank b = new bank();
		b.deposit(1000);
		try {
			b.withdrawal(3000);
		} catch (insuffFund e) {
			System.out.println(e);
		}
	}
	

}