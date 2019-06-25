package com.tyss.org.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMouse {
public static void main(String[] args) {
	Mouse m=new Mouse("one");
	Mouse m1=new Mouse("two");
	Mouse m2=new Mouse("three");
	Mouse m3=new Mouse("four");
	
	ExecutorService service=Executors.newFixedThreadPool(2);
	service.execute(m);
	service.execute(m1);
	service.execute(m2);
	service.execute(m3);

	service.shutdown();
}
}
