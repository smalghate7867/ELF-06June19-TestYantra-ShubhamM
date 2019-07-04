package com.tyss.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
@Log
/**
 * 
 * @author Administrator
 *No need of transactio for Select operation
 *
 * */
public class GetRecordEmployeeInfo {
public static void main(String[] args) {
	//Configuration cfg = new Configuration();
	//cfg.configure("hibernate.cfg.xml");
	// cfg.addAnnotatedClass(EmployeeInfoBean.class);
	//SessionFactory sesfact = cfg.buildSessionFactory();
	SessionFactory sesfact = SessionFactoryUtil.getSession();
	Session session = sesfact.openSession();
		/*
		 * System.out.println("111"+SessionFactoryUtil1.getSessionInfo());
		 * System.out.println("222"+SessionFactoryUtil1.getSessionInfo());
		 * System.out.println("333"+SessionFactoryUtil1.getSessionInfo());
		 */
	SessionFactoryUtil1 obj=new SessionFactoryUtil1();
	System.out.println("444"+obj.getSessionInfo());
	SessionFactoryUtil1 obj1=new SessionFactoryUtil1();

	System.out.println("555"+obj1.getSessionInfo());
	//Transaction tr = session.beginTransaction();
	EmployeeInfoBean empInfo =session.get(EmployeeInfoBean.class,2);

	log.info("id:     "+empInfo.getId());
	log.info("name:   "+empInfo.getName());
	log.info("age:    "+empInfo.getAge());
	log.info("gender: "+empInfo.getGender());
	log.info("salary: "+empInfo.getSalary());
	log.info("phone:  "+empInfo.getPhone());
	log.info("jdate   :"+empInfo.getJoiningDate());
	log.info("ac no:  "+empInfo.getAccountNumber());
	log.info("email:  "+empInfo.getEmail());
	log.info("post:   "+empInfo.getDesignation());
	log.info("dob:    "+empInfo.getDob());
	log.info("dept id:"+empInfo.getDeptId());
	log.info("mngr id:"+empInfo.getMngrId());
	
	
	session.close();
	
}
}
