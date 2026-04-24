package com.assignment.module1;


class Student{
	String Name;
	int RollNo;
	
	public Student(String name, int rollNo) {
		this.Name = name;
		this.RollNo = rollNo;
	}

	void Display() {
		
		System.out.println("Rollno : "+RollNo+" Name: "+Name);
		
	}
}

public class StudentAssignment {
	
	
	
	public static void main(String[] args) {
		
		Student s1=new Student("Ferin", 10);
		s1.Display();
		Student s2 = new Student("Sahill", 790);
		s2.Display();
		
		
		
	}

}