package com.tyss.hibernate.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernate.xml.dto.TrainingInfoBean;

/**
 * Hello world!
 *
 */
public class SaveRecord {
	public static void main(String[] args) {
		
		TrainingInfoBean trainBean=new TrainingInfoBean();
		trainBean.setCourseId(1);
		trainBean.setCourseName("JAVA");
		trainBean.setCourseType("Regular");
		trainBean.setDuration("3 Month");
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sesfact=cfg.buildSessionFactory();
		Session ses=sesfact.openSession();
		Transaction tr=ses.beginTransaction();
		ses.save(trainBean);
		tr.commit();
		ses.close();
		System.out.println("Success");
	}
}
