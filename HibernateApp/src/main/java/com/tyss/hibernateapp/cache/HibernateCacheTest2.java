package com.tyss.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {
	public static void main(String[] args) {

		System.out.println("1 st Time"+getEmployeedata(3).toString());
		System.out.println("2 nd Time"+getEmployeedata(3).toString());
		System.out.println("3 rd Time"+getEmployeedata(3).toString());
	}// END of main
	
	private static NewEmployeeInfoBean getEmployeedata(int id) {
		// 1 load confg file
		Configuration config = new Configuration();
		config.configure("com/tyss/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);

		// 2 build session factory
		SessionFactory sessionFactory = config.buildSessionFactory();

		// 3 open Session
		Session session = sessionFactory.openSession();

		// 4 db interaction via session
		NewEmployeeInfoBean bean = session.get(NewEmployeeInfoBean.class, id);
		//System.out.println("FIRST  time-->> : " + bean.toString());


		// 5 Close the session
		session.close();
		return bean;
	}
}// END of Class
