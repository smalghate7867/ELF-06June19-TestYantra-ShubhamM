package com.tyss.org.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyProduct {
	
	private static final Logger log = Logger.getLogger("shubhanm");
public void buySample() {

	log.log(Level.SEVERE, "SERVER in by ");
	log.log(Level.WARNING, "WARNING in by ");
	log.log(Level.INFO, "INFO in by ");
	log.log(Level.CONFIG, "CONFIG in by ");
	log.log(Level.FINE, "FINE in by ");
	log.log(Level.FINER, "FINER in by ");
	log.log(Level.FINEST, "FINEST in by ");
}
}
