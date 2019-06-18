package com.tyss.org.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;

public class FileHandlingExampleReadUsingApache {
	public static final Logger log = Logger.getLogger("shubham");

public static void main(String[] args) {
	try {
		String filedata=FileUtils.readFileToString(new File("new.txt"));
		log.log(Level.INFO,filedata);
	} catch (IOException e) {
		log.log(Level.SEVERE,e.getMessage());
	}
}
}
