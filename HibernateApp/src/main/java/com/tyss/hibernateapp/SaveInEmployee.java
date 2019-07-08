package com.tyss.hibernateapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;

public class SaveInEmployee {
	public static void main(String[] args) {
		//Configuration cfg = new Configuration();
		//cfg.configure("hibernate.cfg.xml");
		// cfg.addAnnotatedClass(EmployeeInfoBean.class);
		//SessionFactory sesfact = SessionFactoryUtil.getSession();
		SessionFactory sesfact = SessionFactoryUtil.getSession();
		Session session = sesfact.openSession();

		System.out.println("obj1 " + SessionFactoryUtil.getSession());
		System.out.println("obj2 " + SessionFactoryUtil.getSession());
		System.out.println("obj3 " + SessionFactoryUtil.getSession());

		Transaction tr = session.beginTransaction();
		EmployeeInfoBean emp1 = new EmployeeInfoBean();
		emp1.setId(5);
		emp1.setName("Roy");
		emp1.setAge(22);
		emp1.setGender("female");
		emp1.setSalary(1000000);
		emp1.setPhone(1234567890);
		emp1.setJoiningDate(new Date(2019, 06, 12));
		emp1.setAccountNumber(123456);
		emp1.setEmail("shubham@gmail.com.com");
		emp1.setDesignation("Software Engineer");
		emp1.setDob(new Date(2019, 06, 12));
		emp1.setDeptId(1);
		emp1.setMngrId(2);

		session.save(emp1);
		tr.commit();
		session.close();
	}
}
