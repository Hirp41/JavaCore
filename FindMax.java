package com.assignment.module1;

class findmaximum{
	
	public static int Compare(int a,int b,int c) {
		int max;
		
		if(a>b) {
			if(a>c) {
				max=a;
			}
			else {
				max=c;
			}
		}
		else {
			if(b>c) {
				max=b;
			}
			else {
				max=c;
			}
		}
			
		
		
		return max;
		
	}
}

public class FindMax {
	
	public static void main(String[] args) {

		int Result = findmaximum.Compare(3,99,5);
		System.out.println("Maximum is : "+Result);
		
		
	}

	
	}
	