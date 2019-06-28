package com.tyss.org.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriteDataUsingFos {
	public static void main(String[] args) {
		String msg = "message";
		byte[] by = msg.getBytes();
		try (FileOutputStream fosFileOutputStream = new FileOutputStream("26-06-2009")) {

			fosFileOutputStream.write(by);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
