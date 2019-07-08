package com.tyss.hibernateapp.criteria.projection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.tyss.hibernateapp.SessionFactoryUtil;
import com.tyss.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class GetDataByProjection {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSession();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection projectionName = Projections.property("name");
		// criteria.setProjection(projection);
		Projection projectionDesignnation = Projections.property("designation");
		ProjectionList pList = Projections.projectionList();
		pList.add(projectionName);
		pList.add(projectionDesignnation);
		criteria.setProjection(pList).list();
		List<Object[]> list = criteria.list();
		for (Object[] objects : list) {
			log.info("name-->" + objects[0]+" designation-->"+objects[1]);
		}
	}
}
