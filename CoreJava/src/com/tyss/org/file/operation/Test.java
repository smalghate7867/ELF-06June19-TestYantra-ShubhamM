package com.tyss.org.file.operation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
public static final Logger log=Logger.getLogger("shubham");
	public static void main(String[] args) {
		Person p = new Person();
		p.setFirstName("Shubham");
		p.setLastName("M");
		p.setId(1);
		FileOutputStream fos =null;
		ObjectOutputStream obj=null;
		try {
			 fos = new FileOutputStream("test.txt");
			 obj = new ObjectOutputStream(fos);
			obj.writeObject(p);
			obj.close();
		} catch (IOException e) {
			log.log(Level.SEVERE,e.getMessage());
		}
		finally {
			if(fos!=null)
				try {
					fos.close();
				} catch (IOException e) {
					log.log(Level.SEVERE,e.getMessage());
				}
			if(obj!=null)
				try {
					obj.close();
				} catch (IOException e) {
					log.log(Level.SEVERE,e.getMessage());
				}
			
		}
	}

}
