package com.vvsk.fullstack.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Demonstrate the Java Program to write to file
 */
public class FileWriterExample {

    public static void main(String args[]){

        String fileName = "example.txt";

        File file = new File(fileName);

        try {
            // Initializing FileWriter for the file object
            FileWriter writer = new FileWriter(file);

            writer.write("Hello, This is example for wrting some text from Java Program");

            //close resource
            writer.close();

            System.out.println("Completed writing into file "+fileName);

        } catch (IOException e) {
            System.out.println("Unable to intialize FileWriter for file "+fileName);
            e.printStackTrace();
        }

        
    }

}
