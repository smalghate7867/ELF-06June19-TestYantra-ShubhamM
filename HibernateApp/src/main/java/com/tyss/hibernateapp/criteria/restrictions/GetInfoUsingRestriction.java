package com.tyss.hibernateapp.criteria.restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.tyss.hibernateapp.SessionFactoryUtil;
import com.tyss.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class GetInfoUsingRestriction {
	public static void main(String[] args) {
		SessionFactory sf = SessionFactoryUtil.getSession();
		Session session = sf.openSession();
		
		//fetch by id
		/*
		 * Criteria criteria=session.createCriteria(EmployeeInfoBean.class).add(Restrictions.eq("id",3));
		 */	
		/*
		 * Criterion cr=Restrictions.eq("id", 3); criteria.add(cr); EmployeeInfoBean
		 * emp= (EmployeeInfoBean) criteria.uniqueResult();
		 * log.info("data using id "+emp)
		 */
		
		//fetch by condition
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class).add(Restrictions.gt("salary", 2000.00));
		List<EmployeeInfoBean> list = criteria.list();
		list.forEach(action -> {
			log.info("DATA---->>>" + action);
		});

	}
}
