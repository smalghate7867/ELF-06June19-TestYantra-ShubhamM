package com.tyss.jdbcapp;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class MyFirstJdbcApp {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String sql = "select * from emp_information" + " where id=1";
	
		try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root",
				"root"); PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery();) {

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
