package com.BikkadIT.SpringMvcAppWithHibernate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringMvcAppWithHibernate.dao.EmployeeDaoI;
import com.BikkadIT.SpringMvcAppWithHibernate.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeServiceI{

	@Autowired
	private EmployeeDaoI employeeDaoI;
	
	@Override
	public int saveEmployee(Employee emp) {
		
		int id = employeeDaoI.saveEmployee(emp);
		return id;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployee = employeeDaoI.getAllEmployee();
		return allEmployee;
	}

	
}
