package com.vvsk.fullstack.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrate the Java Program to read from file
 */
public class FileReaderExample {

    public static void main(String args[]){

        String fileName = "example.txt";

        File file = new File(fileName);

        String output = "";

        try {
            // Initializing FileReader for the file object
            FileReader reader = new FileReader(file);

            int c = reader.read();

            // Iteration until EOF(-1)
            while(c!=-1){
                
                output+=(char)c;

                c = reader.read();

            };

            //close resource
            reader.close();

            System.out.println("Completed reading from file "+fileName);
            System.out.println("File Content: "+output);

        } catch (IOException e) {
            System.out.println("Unable to intialize FileReader for file "+fileName);
            e.printStackTrace();
        }

    }

}
