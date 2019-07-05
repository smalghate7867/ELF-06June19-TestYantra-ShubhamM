package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {
	/*
	 * public static void main(String[] args) { Statement stmt=null;
	 * 
	 * try(Connection
	 * con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",
	 * "root");) { stmt=con.createStatement();
	 * 
	 * String sql = "INSERT INTO Registration " + "VALUES (100, 'Zara', 'Ali', 18)";
	 * stmt.executeUpdate(sql); } catch (SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } }
	 */
	
	public static void main(String[] args) {
		PreparedStatement pstmt=null;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
