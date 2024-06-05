package com.vvsk.fullstack.files;

import java.io.File;

/**
 * Demonstrate Java Program to check whether a file exists
 */
public class FileExistsExample {

    public static void main(String args[]){

        String fileName = "vvskchaitanya.txt";

        File file = new File(fileName);

        boolean check = file.exists();

        System.out.println("File with "+fileName+" "+(check?"exists":"does not exist"));

    }
}
