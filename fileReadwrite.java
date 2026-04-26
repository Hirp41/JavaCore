package com.assignment.module1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReadWrite {
	
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write("hello , currently doing assignments of java");
			fw.close();
			System.out.println("Data Written successfully");
			
			FileReader fr = new FileReader("test.txt");
			int i;
			while((i=fr.read())!=-1) {
				System.out.println("Reading File : "+(char)i);
				
				
			}
			fr.close();
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}