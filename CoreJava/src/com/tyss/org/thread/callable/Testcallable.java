package com.tyss.org.thread.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class Testcallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Pencil p = new Pencil();
		FutureTask<Integer> ft = new FutureTask<Integer>(p);
		
		Thread t = new Thread(ft);
		t.start();
		
		int i = ft.get();
		log.info("---->>" + i);
	}
}
