package com.example.icf.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.icf.demo.dao.EmployeeData;
import com.example.icf.demo.datatypes.Employee;

@Service
public class EmployeeService{

	//Dependency Injection of DAO class
	@Autowired
	EmployeeData employeeData;

	public Employee findEmployee(String id)
	{
		//invoking DAO class method
		return employeeData.findEmpoylee(id);
	}
	
	public String addEmployee(Employee employee) throws Exception
	{
		try
		{
			//invoking DAO class method

			return employeeData.addEmpoylee(employee);
		}
		catch (Exception se) {
			//custom exception message
			throw new Exception("Error:  id already exists");
		}
		
		
	}
	
	public String updateEmployee(Employee employee) throws Exception
	{
			if(employee.getemployeeid()==null)
				//custom exception message
				throw new Exception("employee id cannot be null");

			//invoking DAO class method

			return employeeData.updateEmpoylee(employee);	
		
	}
	
	public String deleteEmployee(String id) throws Exception
	{

		//invoking DAO class method

			return employeeData.deleteEmpoylee(id);
		
	}
}
