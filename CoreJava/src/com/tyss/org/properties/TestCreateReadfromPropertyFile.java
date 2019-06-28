package com.tyss.org.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestCreateReadfromPropertyFile {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("CompanyDetails.properties");
			Properties p=new Properties();
			try {
				p.load(fis);
				
				String pno=p.getProperty("PhoneNo");
				String name=p.getProperty("Companyname");
				if(pno.equals("")) {
					System.out.println("FFFFF");
				}else {
					log.info("number :"+pno);
					log.info("name :"+name);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

