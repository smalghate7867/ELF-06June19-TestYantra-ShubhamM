package com.tyss.org.thread.callable;

import java.util.concurrent.Callable;

public class Pencil implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		//fact logic
		return 120;
	}

}
