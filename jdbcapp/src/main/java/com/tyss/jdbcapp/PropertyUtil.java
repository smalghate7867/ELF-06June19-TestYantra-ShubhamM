package com.tyss.jdbcapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
	Properties prop = new Properties();
	private static PropertyUtil util;


	public static PropertyUtil getPropertyUtil() throws Exception {
		if (util == null) {
			util = new PropertyUtil();
		}
		return util;
	}

	private PropertyUtil() throws IOException {

		FileInputStream fis = new FileInputStream("dbInfo.properties");
		prop.load(fis);

	}

	public String getProperty(String key) {
		return prop.getProperty(key);
	}

}
