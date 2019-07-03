package com.tyss.jdbcapp;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public final class InsertDataInEmployee {
	public static void main(String args[]) {
		/*
		 * String sql = "INSERT INTO emp_information " +
		 * "VALUES (5, 'AISHHAAAA', '22', 'm','5000','456456','2018-05-06','6666','riya@gmail.com','Developer','2017-05-06','1','10')"
		 * ;
		 */
		String sql = "INSERT INTO emp_information(ID,NAME,AGE,GENDER,SALARY,PHONE,JOINING_DATE,ACCOUNT_NO,EMAIL,DESIGNNATION,DOB,DEPT_ID,MNGR_ID) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root",
				"root");) {
			

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.valueOf(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setString(3, args[2]);
			pstmt.setString(4, args[3]);
			pstmt.setString(5, args[4]);
			pstmt.setString(6, args[5]);
			pstmt.setDate(7, java.sql.Date.valueOf(args[6]));
			pstmt.setString(8, args[7]);
			pstmt.setString(9, args[8]);
			pstmt.setString(10, args[9]);
			pstmt.setDate(11, java.sql.Date.valueOf(args[10]));
			pstmt.setInt(12, Integer.valueOf(args[11]));
			pstmt.setInt(13, Integer.valueOf(args[12]));
			int rs = pstmt.executeUpdate();
			log.info("result set: "+rs);
			if(rs<0) {
				log.info("result set: "+rs);
			}else {
				log.info("result set: " + rs);
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
