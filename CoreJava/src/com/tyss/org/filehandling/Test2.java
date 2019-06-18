package com.tyss.org.filehandling;

import java.io.File;

public class Test2 {
	public static void main(String[] args) {
		File f=new File("Movies/HINDI/OLD");
		//boolean result=f.mkdir();
		boolean result=f.mkdirs();

		System.out.println(result);
		
	}
}
