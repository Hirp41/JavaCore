package com.assignment.module1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class linebylineRead {
	
	
	    public static void main(String[] args) {
	        
	        try {
	            FileReader fr = new FileReader("test.txt");
	            BufferedReader br = new BufferedReader(fr);

	            String line;
	            System.out.println("Reading file line by line:");

	            while((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	            br.close();
	            fr.close();

	        } catch(IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}