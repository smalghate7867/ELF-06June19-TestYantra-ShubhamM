package com.tyss.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;

public class DeleteRecord {
public static void main(String[] args) {
	//Configuration cfg = new Configuration();
	//cfg.configure("hibernate.cfg.xml");
	// cfg.addAnnotatedClass(EmployeeInfoBean.class);
	//SessionFactory sesfact = cfg.buildSessionFactory();
	SessionFactory sesfact = SessionFactoryUtil.getSession();
	Session session = sesfact.openSession();
	Transaction tr = session.beginTransaction();
	EmployeeInfoBean empInfo =session.get(EmployeeInfoBean.class,3);
	session.delete(empInfo);
	tr.commit();
	session.close();

}
}
