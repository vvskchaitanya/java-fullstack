package com.vvsk.fullstack.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Demonstrate a program to perform write operation on read-only file
 */

public class FilePermissionExample {

	public static void main(String[] args) {
		
		String fileName = "readonlyexample.txt";

        File file = new File(fileName);
        
        FileWriter writer = null;
        

        try {
        	// Step 1: Create New File
            boolean success = file.createNewFile();
            
            // Step 2: Write the data into the file
            writer = new FileWriter(file);
            
            writer.write("Creating a Read-Only File, next time File Writer will not be able to access this file");
            
            // Cannot perform write operation which makes it a read-only file
            file.setWritable(false);
            
            // Close the writer
            writer.close();
            
            // Trying to read the file using FileReader
            System.out.println("File with name \""+fileName+"\" "+(success? "is created" : "already exists"));
            
            // Accessing read only file
            FileReader reader = new FileReader(file);
            
            String output = "";
            
            int c = reader.read();
            
            while(c!=-1) {
            	
            	output += (char) c;
            	c = reader.read();
            	
            }
            
            System.out.println("Reading File, File Content: \n"+output);
            
            reader.close();
            
            writer.write("Again trying to write into the file");
            
            writer.close();
            
            System.out.println("File with name \""+fileName+"\" "+(success? "is created" : "already exists"));
            
            // Accessing read only file second time with Writer
            writer = new FileWriter(file);
            
            writer.write("Again trying to write into the file");
            
            writer.close();
            
        } catch (IOException e) {
        	
            System.out.println("Unable to create file "+fileName);
            
        } 
        
        
		

	}

}
