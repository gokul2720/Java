package com.gp.day7.exception;

import java.io.File;
import java.io.IOException;

public class Vignesh {
	
	public static void main(String[] args) throws Exception {
		 
		Shashi sashi= new Shashi();
		File file= new File ("file.text");
		String task;
		try {
			task = sashi.task(file);
			System.out.println(task);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
