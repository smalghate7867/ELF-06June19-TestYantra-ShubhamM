package com.tyss.designpattern.dao;

public class EmployeeDAOFactory {
	
	private static String dbinstanceType = "Hibernate";

	private EmployeeDAOFactory() {}
	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbinstanceType.equals("jdbc")) {
			return dao = new EmployeeDAOJDBCImpl();
		} else if (dbinstanceType.equals("Hibernate")) {
			return dao = new EmployeeDAOHibernateImpl();
		}
		
		return dao;
	}
}
