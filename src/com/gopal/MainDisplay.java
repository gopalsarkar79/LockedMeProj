package com.gopal;

import java.io.FileNotFoundException;
import java.util.Scanner;



public class MainDisplay {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("**********Welcome to the Locked Me Application!***********"+"\n**********************************************************************\n");
		System.out.println("\n***************My name is Gopal Sarkar. I am a full Stack Developer*****************\n"+"\nThis application will allow to Read, Create, Delete, Modify a particular file in the directory!");
		System.out.println("\nLet's try it!");
		System.out.println("\nTry the optoins as below:");
		System.out.println("Enter 1 to read file details in the folder: "+"\nEnter 2 to Create a file."+"\nEnter 3 to Delete a file."+"\nEnter 4 to Modify a file."+"\nEnter 5 to close the Application."+"\nHere are few files from the folder!");
		System.out.println("\n*************"+"\n");
		ListFiles files = new ListFiles();
		files.display();
		System.out.println("");
		Scanner scanner= new Scanner(System.in);
		int input= scanner.nextInt();
		while(true) {
		switch(input) {
		case 1: 
			SwitchFiles SF= new SwitchFiles();
			SF.display();
			break;
			
		case 2:
			CreateFile create= new CreateFile();
			create.disply();
			break;
						
		case 3: 
			DeleteFile delete= new DeleteFile();
			delete.display();
			break;
			
		case 4:
			FileWrite write= new FileWrite();
			write.display();
			break;
		case 5: 
			System.out.println("Application closed!");
			System.exit(0);
			break;
		}
		break;
		}
	
	}
	

}
