package com.tyss.org.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registaration {
	private static final Logger log = Logger.getLogger("amazon");

	void connectDb() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
			System.out.println(con);
		} catch (ClassNotFoundException e1) {
			log.log(Level.SEVERE, e1.getMessage());
		} catch (SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
		}

		log.log(Level.CONFIG, "dd config success");
	}

	void storeDb() {
		System.out.println("stored successfully");
		log.log(Level.SEVERE, "data stored");
	}

}
