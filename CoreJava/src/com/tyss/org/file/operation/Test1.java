package com.tyss.org.file.operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1 {
	public static final Logger log = Logger.getLogger("shubham");

	public static void main(String[] args) {

		FileInputStream fs = null;
		ObjectInputStream obj = null;
		Person p = null;
		try {
			fs = new FileInputStream("test.txt");
			obj = new ObjectInputStream(fs);
			p = (Person) obj.readObject();

			System.out.println(p.getFirstName());
			System.out.println(p.getLastName());
			System.out.println(p.getId());

		} catch (IOException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			if (obj != null) {
				try {
					obj.close();
				} catch (IOException e) {
					log.log(Level.SEVERE, e.getMessage());
				}
			}
			if (fs != null) {
				try {
					fs.close();
				} catch (IOException e) {
					log.log(Level.SEVERE, e.getMessage());
				}
			}
		}
	}
}
