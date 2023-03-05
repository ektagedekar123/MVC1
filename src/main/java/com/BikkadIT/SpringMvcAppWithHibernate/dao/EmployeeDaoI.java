package com.BikkadIT.SpringMvcAppWithHibernate.dao;

import java.util.List;

import com.BikkadIT.SpringMvcAppWithHibernate.model.Employee;

public interface EmployeeDaoI {

	public int saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();
}
