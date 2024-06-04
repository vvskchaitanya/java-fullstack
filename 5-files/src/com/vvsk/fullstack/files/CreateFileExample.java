package com.vvsk.fullstack.files;

import java.io.File;
import java.io.IOException;

/**
 * Demonstrate the Java Program to create new file
 */
public class CreateFileExample {

    public static void main(String args[]){

        String fileName = "example.txt";

        File file = new File(fileName);

        try {
            boolean success = file.createNewFile();
            
            System.out.println("File with name \""+fileName+"\" "+(success? "is created" : "already exists"));
            
        } catch (IOException e) {
            System.out.println("Unable to create file "+fileName);
        }
        

    }
}
