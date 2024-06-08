package com.vvsk.fullstack.threads;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import java.nio.file.Path;

/** Demonstrate Java Program to copy files from source folder to destination folder */
public class CopyFilesExample {

    private static String sourceFolder = "dir1/";
    private static String destinationFolder = "dir2/";

    public static void main(String args[]){
        
        Path source = Paths.get(sourceFolder);

        try {
            Files.walk(source).forEach(f->{
                File f1 = f.toFile();
                if(!f1.isDirectory()){

                String file = f1.getName();
                System.out.println("Creating CopyFileThread for "+file);

                CopyFileThread copyFileThread = new CopyFileThread(sourceFolder+file, destinationFolder+file);

                // Starting the CopyFileThread for each file
                copyFileThread.start();
                }
            }
                
            );
        } catch (IOException e) {
            System.out.println("Unable to get list of files from source directory");
            e.printStackTrace();
        }

        

    }

}
