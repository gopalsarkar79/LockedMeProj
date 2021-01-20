package com.gopal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public void display() {
		try {
			FileWriter writer= new FileWriter("C:\\Users\\Dell\\Desktop\\LockedMeProj\\YourFile.txt");
			writer.write("Hi, Your file has been created!");
			writer.close();
			System.out.println("Successfully wrote to the file!");
			
		} catch (IOException e) {
			System.out.println("An error occurred!");
			e.printStackTrace();
		}
		
	}

}
