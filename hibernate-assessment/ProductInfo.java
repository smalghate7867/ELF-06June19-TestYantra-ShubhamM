package com.tyss.hibernate.assessment;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.tyss.hibernateapp.SessionFactoryUtil;

import lombok.extern.java.Log;

@Log
public class ProductInfo {

	public static void main(String[] args) {

		SessionFactory sf = SessionFactorySingleton.getSession();
		Session session = sf.openSession();

		Product product = new Product();
		product.setProductName("Iphone");
		product.setColour("black");
		product.setPrice(100.00);

		Product product2 = new Product();
		product2.setProductName("Nokia");
		product2.setColour("black");
		product2.setPrice(200.00);

		Product product3 = new Product();
		product3.setProductName("Samsung");
		product3.setColour("black");
		product3.setPrice(99.00);

		Product product4 = new Product();
		product4.setProductName("Oppo");
		product4.setColour("black");
		product4.setPrice(180.00);

		Criteria criteria = session.createCriteria(Product.class).add(Restrictions.lt("price", 100.00))
				.add(Restrictions.ilike("productName", "A%"));
		List<Product> list = criteria.list();
		list.forEach(action -> {
			log.info("Data---->>>" + action);
		});
	}
}
