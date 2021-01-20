package com.gopal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class UserSearch {

	public void disply() throws FileNotFoundException {
		File input = new File("C:\\Users\\Dell\\Desktop\\LockedMeProj");
		FileReader fr= null;
		Scanner ob= new Scanner (input);
		String SearchWord, str;
		System.out.println("Enter the file name: ");
		SearchWord= ob.nextLine();
		
			fr= new FileReader(input);
			BufferedReader br = new BufferedReader(fr);
			try {
				while((str=br.readLine()) !=null) {
						if (str.contains(SearchWord))
							System.out.println(str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		
		}
		
	}


