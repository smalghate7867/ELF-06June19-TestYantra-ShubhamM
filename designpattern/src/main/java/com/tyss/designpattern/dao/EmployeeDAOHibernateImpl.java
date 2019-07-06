package com.tyss.designpattern.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.designpattern.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		//SessionFactory sesFact = SessionFactoryUtil.getSession();
		Session session = SessionFactoryUtil.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		List employees = criteria.list();
		return employees;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		//SessionFactory sesFact = SessionFactoryUtil.getSession();
		Session session = SessionFactoryUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		return bean;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return false;
	}

}
