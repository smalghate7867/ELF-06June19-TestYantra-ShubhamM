package com.tyss.jdbcapp;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public class MyJdbcWithAws {
public static void main(String[] args) {

	String sql = "select * from emp_information" + " where id=10";
	/*
	 * Driver driver=new Driver(); DriverManager.deregisterDriver(driver);
	 * 
	 * try { Class.forName("com.mysql.jdbc.Driver").newInstance(); } catch
	 * (InstantiationException | IllegalAccessException e1) { // TODO Auto-generated
	 * catch block e1.printStackTrace(); }
	 */

	try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql"
			+ "://db.cpoo2xn7h1cf.ap-south-1.rds.amazonaws.com" + 
			":"
			+ "3306/"
			+ "db", "root",
			"root1234"); PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery();) {

		while (rs.next()) {
			log.info("id " + rs.getInt(1));
			log.info("name" + rs.getString(2));
			log.info("" + rs.getString(3));
			log.info("" + rs.getString(4));
			log.info("" + rs.getString(5));
			log.info("" + rs.getString(6));
			log.info("" + rs.getString(7));
			log.info("" + rs.getString(8));
			log.info("" + rs.getString(9));
			log.info("" + rs.getString(10));
			log.info("" + rs.getString(11));
			log.info("" + rs.getString(12));
			log.info("" + rs.getString(13));

		}

	}

	catch (SQLException e) {
		e.printStackTrace();
	}

}
}
