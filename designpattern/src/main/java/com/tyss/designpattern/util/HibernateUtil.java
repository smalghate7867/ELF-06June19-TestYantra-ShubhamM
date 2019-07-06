package com.tyss.designpattern.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.designpattern.beans.EmployeeInfoBean;


/**
 * 
 * @author Administrator Singleton class for Session factory
 */
public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}

	private static SessionFactory getSession() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration()
					.configure()
					.addAnnotatedClass(EmployeeInfoBean.class)
					.buildSessionFactory();
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