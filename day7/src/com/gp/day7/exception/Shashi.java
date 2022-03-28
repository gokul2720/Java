package com.gp.day7.exception;

import java.io.File;
import java.io.FileReader;

public class Shashi {
	
	public String task (File file) throws Exception{
		String s="";
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("no file found");
		}
		FileReader fr=new FileReader("file.txt");
		int read =fr.read();
		while (read != -1) {
			s= s+ ((char)read);
			read=fr.read();
			
		}
		return s;
		}

}
