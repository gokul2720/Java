package com.gp.day7.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedEx {
	public static void main(String[] args) {
		System.out.println("Program started");
		File file = new File ("file.txt");
		try {
			FileReader fr= new FileReader(file);
			int read= fr.read();
			while(read != -1) {
				System.out.print((char)read);
				read= fr.read();
				}
			}catch (FileNotFoundException e) {
				System.out.println("file does not exist");
			}catch (IOException e) {
				System.out.println(" no data exist");
			}
			System.out.println("\n Program end");
			
			
			}
	}
		
	


