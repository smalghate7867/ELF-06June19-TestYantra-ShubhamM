package com.tyss.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.SessionFactoryUtil;
import com.tyss.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadDataDemo {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		SessionFactory sesFact = SessionFactoryUtil.getSession();
		Session session = sesFact.openSession();
		
		/*
		 * String hql = "from EmployeeInfoBean"; Query query = session.createQuery(hql);
		 * List<EmployeeInfoBean> list = query.list();
		 * 
		 * for (EmployeeInfoBean object : list) { log.info("for each" + object); }
		 * list.forEach(action -> { log.info("for each with lambda loop" + action); });
		 * 
		 * for (int i = 0; i < list.size(); i++) { log.info("normal for loop" + list); }
		 */
		 
         
		String hql="select name from EmployeeInfoBean";
		Query query=session.createQuery(hql);
		
		List<String> eName=query.list();
		for (String string : eName) {
			log.info("name"+eName);
		}
				
		
	}
}
