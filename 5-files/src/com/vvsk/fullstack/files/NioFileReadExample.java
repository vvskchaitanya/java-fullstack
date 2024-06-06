package com.vvsk.fullstack.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioFileReadExample {

	public static void main(String[] args) {
		
		Path path = Paths.get("example.txt");
		
		Path path2 = Paths.get("example2.txt");
		
		
		try {
			List<String> lines = Files.readAllLines(path);
			
			Files.copy(path, path2);
			
			for(String line:lines) {
				System.out.println(line);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
