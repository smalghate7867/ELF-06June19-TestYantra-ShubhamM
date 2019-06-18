package com.tyss.org.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;

public class FileHandlingExampleWriteUsingApache {
	public static final Logger log = Logger.getLogger("shubham");

	public static void main(String[] args) {
		try {
			FileUtils.writeStringToFile(new File("new.txt"), "new data", Charset.defaultCharset());

			log.log(Level.INFO, "File Created");
		} catch (IOException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}

}
