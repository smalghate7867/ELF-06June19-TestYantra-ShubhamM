package com.tyss.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;
import com.tyss.hibernateapp.dto.EmployeeOtherInfoBean;

public class UpdateRecordEmployeeInfo {
public static void main(String[] args) {
	//Configuration cfg = new Configuration();
	//cfg.configure("hibernate.cfg.xml");
	// cfg.addAnnotatedClass(EmployeeInfoBean.class);
	//SessionFactory sesfact = cfg.getSession();
	SessionFactory sesfact = SessionFactoryUtil.getSession();
	Session session = sesfact.openSession();
	Transaction tr = session.beginTransaction();
	EmployeeInfoBean empInfo =session.get(EmployeeInfoBean.class, 1);

	empInfo.setName("RaviTEJA");
	session.update(empInfo);
	tr.commit();
	session.close();
	
}
}
