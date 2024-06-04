package com.vvsk.fullstack.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileExample {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }catch(IOException e){

        System.out.println("Exception occured during copying the file");
        e.printStackTrace();
        
      } finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}