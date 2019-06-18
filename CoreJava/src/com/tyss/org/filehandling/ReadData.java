package com.tyss.org.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadData {
	public static final Logger log = Logger.getLogger("shubham");

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("myWriteFile.txt");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();

		} catch (IOException e) {
			log.log(Level.SEVERE, "SERVE");
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					log.log(Level.SEVERE, "SERVE");
				}
			}
		}

	}

}
