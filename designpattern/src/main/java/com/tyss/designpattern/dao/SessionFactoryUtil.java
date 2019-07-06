package com.tyss.designpattern.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Administrator Singleton class for Session factory
 */
public class SessionFactoryUtil {

	private static SessionFactory sessionFactory;

	private SessionFactoryUtil() {
	}

	private static SessionFactory getSession() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;

	}
	public static Session openSession() {
		return getSession().openSession();
	}
}

/*
 * sessionFactory = new Configuration().configure(new URL(
 * "https://raw.githubusercontent.com/smalghate7867/ELF-06June19-TestYantra-ShubhamM/master/hib_config_file/hibernate.cfg.xml"
 * )) .addAnnotatedClass(EmployeeInfoBean.class).buildSessionFactory();
 */