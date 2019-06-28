package com.tyss.org.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestCreateWritrInPropertyFile {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("CompanyDetails.properties");
			Properties p = new Properties();
			p.setProperty("Companyname", "TYSS");
			p.setProperty("PhoneNo", "9595560862");
			try {
				p.store(fos, "Company Details");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
