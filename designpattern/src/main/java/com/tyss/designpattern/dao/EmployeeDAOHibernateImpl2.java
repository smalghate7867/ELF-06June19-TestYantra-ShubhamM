package com.tyss.designpattern.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.designpattern.beans.EmployeeInfoBean;
import com.tyss.designpattern.util.HibernateUtil;

public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		// SessionFactory sesFact = SessionFactoryUtil.getSession();
		Session session = HibernateUtil.openSession();
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
		// SessionFactory sesFact = SessionFactoryUtil.getSession();
		Session session = HibernateUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		return bean;
	}

	private boolean saveOrupdate(EmployeeInfoBean bean) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrupdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrupdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction transaction = null;
		
		try {
			Session session = HibernateUtil.openSession();
			EmployeeInfoBean bean=new EmployeeInfoBean();
			bean.setId(id);
			transaction = session.beginTransaction();
			session.delete(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

}
