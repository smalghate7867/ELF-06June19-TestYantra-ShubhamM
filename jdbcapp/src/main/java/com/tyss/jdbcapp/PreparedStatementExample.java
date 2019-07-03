package com.tyss.jdbcapp;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public class PreparedStatementExample {
	public static void main(String[] args) {
		getEmpInfo();
	}

	public static void getEmpInfo() {
		String sql = "select * from emp_information where id=? and MNGR_ID=?";
		
		
		
		try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root",
				"root");) {

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 5);
			pstmt.setInt(2, 10);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				log.info("" + rs.getInt(1));
				log.info("" + rs.getString(2));
				log.info("" + rs.getString(3));
				log.info("" + rs.getString(4));
				log.info("" + rs.getString(5));
				log.info("" + rs.getString(6));
				log.info("" + rs.getString(7));
				log.info("" + rs.getString(8));
				log.info("" + rs.getString(9));
				log.info("" + rs.getString(10));

			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}