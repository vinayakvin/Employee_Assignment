package com.example.icf.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.icf.demo.dao.EmployeeData;
import com.example.icf.demo.datatypes.Employee;
import com.example.icf.demo.service.EmployeeService;

//@SpringBootTest
class DemoApplicationTests {

	@InjectMocks
	EmployeeService employeeService;
	
	@Mock
	EmployeeData employeeData;
	
	
	@Test
	void addEmployeeTest() throws Exception {
		 Employee e = new Employee();
		Mockito.when(employeeData.addEmpoylee(ArgumentMatchers.any(Employee.class))).thenReturn("");
		String result=employeeService.addEmployee(e);
		
		assertEquals(result, "");
		
	}

	
	@Test
	void deleteEmployeeTest() throws Exception {
		 Employee e = new Employee();
		Mockito.when(employeeData.deleteEmpoylee(ArgumentMatchers.anyString())).thenReturn("");
		String result=employeeService.deleteEmployee("123");
		
		assertEquals(result, "");
		
	}
	
	@Test
	void findEmployeeTest() throws Exception {
		 Employee e = new Employee();
		Mockito.when(employeeData.findEmpoylee(ArgumentMatchers.anyString())).thenReturn(e);
		Employee result=employeeService.findEmployee("123");
		assertNotNull(result);
	}
	
	@Test
	void updateEmployeeTest() throws Exception {
		 Employee e = new Employee();
		 e.setId("123");
		 e.setEmployeeId("456");
		Mockito.when(employeeData.updateEmpoylee(ArgumentMatchers.any(Employee.class))).thenReturn("");
		String result=employeeService.updateEmployee(e);
		
		assertEquals(result, "");
		
		
	}
}
