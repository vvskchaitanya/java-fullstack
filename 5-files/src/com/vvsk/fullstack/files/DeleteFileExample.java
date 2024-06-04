package com.vvsk.fullstack.files;

import java.io.File;

public class DeleteFileExample {

    public static void main(String args[]){

        String fileName = "example.txt";

        File file = new File(fileName);

        
        boolean success = file.delete();
        
        System.out.println("File with name \""+fileName+"\" "+(success? "is deleted" : "cannot be deleted"));        

    }

}
