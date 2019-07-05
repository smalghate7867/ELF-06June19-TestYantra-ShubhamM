package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tyss.jdbcapp.connectionpool.ConnectionPool;

import lombok.extern.java.Log;

@Log
public class GetEmpInfoPreparedStmt {
	static Connection con = null;
	static ConnectionPoolTest pool;

	public static void main(String[] args) {

		String sql = "select * from emp_information where id=?";
		try {
			pool=ConnectionPoolTest.getConnectionPoolTest();
			con=pool.getConnectionFromPool();

			PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setInt(1, 1);
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.returnConnectionToPool(con);
		}
	}

	/*
	 * public static void getEmpInfo() { String sql =
	 * "select * from emp_information where id=?"; try (java.sql.Connection con =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root",
	 * "root");) {
	 * 
	 * PreparedStatement pstmt = con.prepareStatement(sql); pstmt.setInt(1, 6);
	 * ResultSet rs = pstmt.executeQuery(); while (rs.next()) { log.info("" +
	 * rs.getInt(1)); log.info("" + rs.getString(2)); log.info("" +
	 * rs.getString(3)); log.info("" + rs.getString(4)); log.info("" +
	 * rs.getString(5)); log.info("" + rs.getString(6)); log.info("" +
	 * rs.getString(7)); log.info("" + rs.getString(8)); log.info("" +
	 * rs.getString(9)); log.info("" + rs.getString(10));
	 * 
	 * }
	 * 
	 * }
	 * 
	 * catch (SQLException e) { e.printStackTrace(); } }
	 */
}