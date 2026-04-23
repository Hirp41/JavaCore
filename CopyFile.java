package com.assignment.module1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copyfile {
public static void main(String[] args) {
        
        try {
            FileReader fr = new FileReader("source.txt");   
            FileWriter fw = new FileWriter("target.txt");   

            int i;

            while((i = fr.read()) != -1) {  
                fw.write(i);                
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully!");

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
}
	
}