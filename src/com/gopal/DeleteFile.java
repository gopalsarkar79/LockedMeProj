package com.gopal;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
	public static void display() {
	try{
		File file= new File("C:\\Users\\Dell\\Desktop\\LockedMeProj\\default.txt");
	
	if (file.delete()) {
		System.out.println(file+" Got deleted");
	}
	else {
		System.out.println("File not deleted!");
	}
	}
	
	catch (Exception e) {
		System.out.println("File already Exists!");
		e.printStackTrace();
		
	}
}
}


