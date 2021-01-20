package com.gopal;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ListFiles {
	
	public void display() {
		
		String folderPath= ("C:\\Users\\Dell\\Desktop\\LockedMeProj");
		Scanner scan= new Scanner(folderPath);
		File folder = new File(folderPath);
		File[] files= folder.listFiles();
		
		for(File file:files) {
			if(file.isFile()) {
				System.out.println("File Name: "+file.getName());
			}
			else
				if (file.isDirectory()) {
					System.out.println("\nFolder Name: "+file.getName());
				}
			
			}
		}
		
		
	}


