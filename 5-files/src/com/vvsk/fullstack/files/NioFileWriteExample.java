package com.vvsk.fullstack.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Demonstrate program to read file lines from one file 
 * replace a string with another string 
 * and copy content to new file
 */

public class NioFileWriteExample {

	public static void main(String[] args) {
		
		Path path = Paths.get("replacesource.txt");
		
		Path path2 = Paths.get("replacedestination.txt");
		
		
		try {
			List<String> lines = Files.readAllLines(path);

			String output = "";
			
			for(String line:lines) {
				
				output += line.replace("Chaitanya", "V.V.S.K");
				System.out.println(line);
				output += "\n";
			}


			// Copy the content of file to destination file

			Files.write(path2, output.getBytes());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
