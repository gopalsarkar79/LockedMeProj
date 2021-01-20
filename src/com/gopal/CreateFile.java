package com.gopal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CreateFile {
	
	public void disply() {
		PrintWriter writer;
		try {
			writer= new PrintWriter("C:\\Users\\Dell\\Desktop\\LockedMeProj\\default.txt", "UTF-8");
			writer.println("Hi user!");
			writer.println("Your default text file has been created successfully!");
			System.out.println("A default file has been created!");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
	}

}
