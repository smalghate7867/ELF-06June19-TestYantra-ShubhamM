package com.tyss.org.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) {
String msg=" bored";
byte b[]=msg.getBytes();

try {
	FileOutputStream fout=new FileOutputStream("myWriteFile2.txt",true);
	fout.write(b);
	fout.close();
	System.out.println("File is created");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
