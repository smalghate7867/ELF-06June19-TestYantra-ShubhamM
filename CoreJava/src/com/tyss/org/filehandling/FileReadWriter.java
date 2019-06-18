package com.tyss.org.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadWriter {
	public static final Logger log = Logger.getLogger("shubham");

public static void main(String[] args) throws FileNotFoundException {
	FileReader fr=null;
	try {
		 fr=new FileReader("myWriteFile.txt");
		int i;
		while( (i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
		
	} catch (IOException e) {
		log.log(Level.SEVERE, "SERVE");


	} finally {
		if(fr!=null) {
			try {
				fr.close();
			} catch (IOException e) {
				log.log(Level.SEVERE, "SERVE");
			}
		}
	}
	
}
}
