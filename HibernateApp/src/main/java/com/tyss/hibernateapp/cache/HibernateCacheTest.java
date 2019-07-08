package com.tyss.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	public static void main(String[] args) {

		// 1 load confg file
		Configuration config = new Configuration();
		config.configure("com/tyss/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);

		// 2 build session factory
		SessionFactory sessionFactory = config.buildSessionFactory();

		// 3 open Session
		Session session = sessionFactory.openSession();

		// 4 db interaction via session
		NewEmployeeInfoBean bean1 = session.get(NewEmployeeInfoBean.class, 1);
		System.out.println("FIRST  time-->> : " + bean1.toString());

		NewEmployeeInfoBean bean2 = session.get(NewEmployeeInfoBean.class, 1);
		System.out.println("SECOND time-->> : " + bean2.toString());

		NewEmployeeInfoBean bean3 = session.get(NewEmployeeInfoBean.class, 1);
		System.out.println("THIRD  time-->> : " + bean3.toString());

		// 5 Close the session
		session.close();

	}// END of main
}// END of Class
