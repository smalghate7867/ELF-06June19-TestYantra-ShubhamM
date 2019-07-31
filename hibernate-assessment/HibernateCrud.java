package com.tyss.hibernate.assessment;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernateapp.SessionFactoryUtil;

public class HibernateCrud {
	public static void main(String[] args) {
		addCustomer();
		// delete();
	}

	private static void addCustomer() {
		SessionFactory sf = SessionFactorySingleton.getSession();
		Session session = sf.openSession();

		Customer customer = new Customer();
		customer.setFirstName("shubham");
		customer.setLastName("M");
		customer.setContactNumber(9595560862L);
		customer.setAddress("Bangalore");

		org.hibernate.Transaction tr = session.beginTransaction();
		session.saveOrUpdate(customer);
		tr.commit();
	}

	public static void delete() {

		SessionFactory sesfact = SessionFactoryUtil.getSession();
		Session session = sesfact.openSession();
		Transaction tr = (javax.transaction.Transaction) session.beginTransaction();
		Customer cust = session.get(Customer.class, 1);
		session.delete(cust);
		try {
			tr.commit();
		} catch (SecurityException | RollbackException | HeuristicMixedException | HeuristicRollbackException
				| SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.close();

	}

}
