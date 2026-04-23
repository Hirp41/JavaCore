package com.assignment.module1;

class Students{
	private int Rollno;
	private String Name;
	private int Marks;
	
	public int getRollNo(){
		return Rollno;
		
	}
	public String getName() {
		return Name;
	}
	public int getMarks() {
		return Marks;
	}
	
	public void setRollno(int Rollno) {
		this.Rollno=Rollno;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setMark(int Marks) {
		this.Marks=Marks;
	}
	
}

public class EncapsulationGetset {
	
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.setRollno(1);
		s1.setName("ferin");
		s1.setMark(76);
		
		System.out.println("Name : "+s1.getName()+", Roll No : "+s1.getRollNo()+", Marks : "+s1.getMarks());
		
	}

}