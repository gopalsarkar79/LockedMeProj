package com.gopal;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class EmployeeName {
	
	public void display() {
	
		File path= new File("C:\\Users\\Dell\\Desktop\\LockedMeProj\\EmployeeName.txt");
		try {
			Scanner scan = new Scanner(path);
			String FileConent = "";
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
