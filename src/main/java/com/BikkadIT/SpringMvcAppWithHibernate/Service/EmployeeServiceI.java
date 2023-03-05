package com.BikkadIT.SpringMvcAppWithHibernate.Service;



import java.util.List;

import com.BikkadIT.SpringMvcAppWithHibernate.model.Employee;


public interface EmployeeServiceI {

	public int saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployees();
}
