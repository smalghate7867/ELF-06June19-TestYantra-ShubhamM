package com.tyss.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernateapp.SessionFactoryUtil;
import com.tyss.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class GetAllEmployeeInfoCriteria {
public static void main(String[] args) {
	SessionFactory sf=SessionFactoryUtil.getSession();
	Session session=sf.openSession();
	Criteria criteria =session.createCriteria(EmployeeInfoBean.class);
	criteria.list();
	List<EmployeeInfoBean> list=criteria.list();
	for (EmployeeInfoBean object : list) {
		log.info("All data"+object);
	}
}
}
