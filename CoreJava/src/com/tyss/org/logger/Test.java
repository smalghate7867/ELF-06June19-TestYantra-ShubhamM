package com.tyss.org.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test {
	private static final Logger log = Logger.getLogger("shubhanm");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();

		try {
			FileHandler fh = new FileHandler("myLogFile");
			fh.setLevel(Level.ALL);
			log.addHandler(fh);

			fh.setFormatter(new SimpleFormatter());

			log.log(Level.SEVERE, "SERVER");
			log.log(Level.WARNING, "WARNING");
			log.log(Level.INFO, "INFO");
			log.log(Level.CONFIG, "CONFIG");
			log.log(Level.FINE, "FINE");
			log.log(Level.FINER, "FINER");
			log.log(Level.FINEST, "FINEST");

			BuyProduct buy = new BuyProduct();
			buy.buySample();

		} catch (SecurityException e) {
			log.log(Level.SEVERE, e.getMessage());
		} catch (IOException e) {
			log.log(Level.SEVERE, e.getMessage());
		}

	}

}
