package com.tyss.org.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	@Override
	public void run() {
		
		  for (int i = 0; i < 2; i++) {
		  
		  //sleep(1000); log.info("inside run" + i);
			 
		  }
		  String s=getName();
			log.info(s +" : get name");
		
		
	}

}
