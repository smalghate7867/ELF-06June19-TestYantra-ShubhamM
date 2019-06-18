package com.tyss.org.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileChar {
public static void main(String[] args) {
	String msg="my msg";
	char c[]=msg.toCharArray();
	try {
		FileWriter fr=new FileWriter("filewriter1.txt");
		
		fr.write(c);
		fr.flush();
		//fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
