/*
 * package com.tyss.jdbcapp;
 * 
 * import java.sql.DriverManager; import java.sql.ResultSet; import
 * java.sql.SQLException; import java.sql.Statement;
 * 
 * import lombok.extern.java.Log;
 * 
 * @Log public class GetEmpInfoStatementStmt { public static void main(String[]
 * args) { getEmpInfo(); }
 * 
 * public static void getEmpInfo() { String sql =
 * "select * from emp_information where id=?"; try (java.sql.Connection con =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root",
 * "root");) {
 * 
 * Statement stmt; ResultSet rs; stmt=con.createStatement();
 * rs=stmt.executeQuery(sql); ((Object) stmt).setInt(1, 6);
 * 
 * while (rs.next()) { log.info("" + rs.getInt(1)); log.info("" +
 * rs.getString(2)); log.info("" + rs.getString(3)); log.info("" +
 * rs.getString(4)); log.info("" + rs.getString(5)); log.info("" +
 * rs.getString(6)); log.info("" + rs.getString(7)); log.info("" +
 * rs.getString(8)); log.info("" + rs.getString(9)); log.info("" +
 * rs.getString(10));
 * 
 * }
 * 
 * }
 * 
 * catch (SQLException e) { e.printStackTrace(); } } }
 */