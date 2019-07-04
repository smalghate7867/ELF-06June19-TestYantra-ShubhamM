package com.tyss.hibernateapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;
import com.tyss.hibernateapp.dto.EmployeeOtherInfoBean;

public class SaveInOtherEmployee {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory sesfact = cfg.buildSessionFactory();
		Session session = sesfact.openSession();

		System.out.println("obj1 " + SessionFactoryUtil.getSession());
		System.out.println("obj2 " + SessionFactoryUtil.getSession());
		System.out.println("obj3 " + SessionFactoryUtil.getSession());

		Transaction tr = session.beginTransaction();
		EmployeeOtherInfoBean emp1 = new EmployeeOtherInfoBean();
		emp1.setId(2);
		emp1.setPan("ONXPCC456");
		emp1.setMarried(false);
		emp1.setBloodGroup("o-");
		emp1.setChallanged(true);
		emp1.setEmergencyContactno(235689132);
		emp1.setEmergencyContactPerson("Riya");
		emp1.setNationality("INDIAN");
		emp1.setReligion("HINDU");
		emp1.setFathersName("RAM");
		emp1.setMothersName("GITA");
		emp1.setSpouseName("NITA");
		emp1.setPassport("HJGFDFJG4786");
		emp1.setAadhar(123456123);

		session.persist(emp1);
		session.save(emp1);
		tr.commit();
		session.close();
		System.out.println("SUCCESS");
		
	}
}
