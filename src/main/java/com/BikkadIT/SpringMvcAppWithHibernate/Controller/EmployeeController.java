package com.BikkadIT.SpringMvcAppWithHibernate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.SpringMvcAppWithHibernate.Service.EmployeeServiceI;
import com.BikkadIT.SpringMvcAppWithHibernate.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceI employeeServiceI;

	@GetMapping("/preRegister")
	public String preRegister() {

		return "empReg";

	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee emp,Model model) {
		int empId = employeeServiceI.saveEmployee(emp);
		
		model.addAttribute("EMPID", empId);
		return "userSuccess";

	}
	@GetMapping("/getAllEmployee")
	public String getAllEmployee(Model model)
	{
		List<Employee> allEmployee = employeeServiceI.getAllEmployees();
		
		model.addAttribute("ALLEMPLOYEE", allEmployee);
		
		return "getEmp";
		
	}
}
// HandlerMapper is used to find out controller class by using url
// GetMapping is used to send data to UI
// Controller class give Response in Model and View format (Model means data will be in Key-Value format & Viwe means Logical file name i.e. Jsp page on which data  which is present in Model is rendered)
// localhost means appl will run on our local server of our system.
// 9090 is a server port no. of our application.
// Controller, service, dao layers communicate through dependency injection.
// See lecture of 2/2/2023.