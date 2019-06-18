
package com.tyss.org.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class Test {
	public static final Logger log = Logger.getLogger("shubham");

	public static void main(String[] args) {
		File f = null;
		String uri	="C:/FirstFile.txt";
		try {
			f = new File(uri);
			f.createNewFile();

		} catch (IOException e) {
			log.severe("SEVERE");
		}

	}
}
