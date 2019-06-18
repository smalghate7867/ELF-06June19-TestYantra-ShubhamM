package com.tyss.org.registration;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AmazonLogger {
private static final Logger log=Logger.getLogger("amazon");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		try {
			FileHandler fh=new FileHandler("amazonFileLog");
			fh.setLevel(Level.ALL);
			fh.setFormatter(new SimpleFormatter());
			log.addHandler(fh);
			Registaration register=new Registaration();
			register.connectDb();
			register.storeDb();
		} catch (SecurityException | IOException e) {
			log.log(Level.SEVERE,e.getMessage());
		}
		
		

	}

}
