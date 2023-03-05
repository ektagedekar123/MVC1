package com.BikkadIT.SpringMvcAppWithHibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIT.SpringMvcAppWithHibernate.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDaoI {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int saveEmployee(Employee emp) {
	
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		int save = (int) session.save(emp);

		session.getTransaction().commit();

		return save;
	}

	
	@Override
	public List<Employee> getAllEmployee() {
		Session session1 = sessionFactory.openSession();
		String hql="from Employee";
		Query query=session1.createQuery(hql);  // createQuery will compile & Run Query & Store it in Query
		List<Employee> list = query.getResultList();
		return list;
	}

}
