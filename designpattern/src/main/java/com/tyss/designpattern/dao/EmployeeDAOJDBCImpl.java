package com.tyss.designpattern.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tyss.designpattern.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log

public class EmployeeDAOJDBCImpl implements EmployeeDAO {
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		String sql = "select * from emp_information";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root", "root");
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			ArrayList<EmployeeInfoBean> beans = new ArrayList<EmployeeInfoBean>();

			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();

				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getInt("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber(rs.getInt("ACCOUNT_NO"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDeptId(rs.getInt("DEPT_ID"));
				bean.setMngrId(rs.getInt("MNGR_ID"));
				beans.add(bean);

			}
			return beans;
		}

		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			log.info(e + "NUMBER FORMAT EXCEPTION");
		}
		return null;
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {
		EmployeeInfoBean empInfo = null;
		String sql = "select * from emp_information" + " where id=?";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root", "root");
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			empInfo = new EmployeeInfoBean();

			while (rs.next()) {
				empInfo.setId(rs.getInt("ID"));
				empInfo.setName(rs.getString("NAME"));
				empInfo.setAge(rs.getInt("AGE"));
				empInfo.setGender(rs.getString("GENDER"));
				empInfo.setSalary(rs.getDouble("SALARY"));
				empInfo.setPhone(rs.getInt("PHONE"));
				empInfo.setJoiningDate(rs.getDate("JOINING_DATE"));
				empInfo.setAccountNumber(rs.getInt("ACCOUNT_NO"));
				empInfo.setEmail(rs.getString("EMAIL"));
				empInfo.setDesignation(rs.getString("DESIGNNATION"));
				empInfo.setDob(rs.getDate("DOB"));
				empInfo.setDeptId(rs.getInt("DEPT_ID"));
				empInfo.setMngrId(rs.getInt("MNGR_ID"));
				return empInfo;
			}

		}

		catch (SQLException e) {
			e.printStackTrace();

		}
		return null;

	}// END of getEmployeeInfo

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}// END of class
