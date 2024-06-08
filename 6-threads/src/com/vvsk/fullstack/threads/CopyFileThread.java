package com.vvsk.fullstack.threads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Copy File Thread is used for copying the source file to destination file */
public class CopyFileThread extends Thread{

    private String source;

    private String destination;

    public CopyFileThread(String src, String dest){
        super();
        this.source = src;
        this.destination = dest;
    }

    public void run(){

        System.out.println("Running "+this);

        Path srcPath = Paths.get(source);
        Path destPath = Paths.get(destination);

        try {

            Files.copy(srcPath, destPath);

        } catch (IOException e) {
            System.out.println("Exception during copy file "+source+" - "+destination);
            e.printStackTrace();
        }

        System.out.println("Completed "+this);

    }

    @Override
    public String toString() {
        return "CopyFileThread [source=" + source + ", destination=" + destination + ", getName()=" + getName() + "]";
    }

    

}
