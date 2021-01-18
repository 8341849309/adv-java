package com.nt.service;

import java.util.List;

import com.nt.bo.Employee;
import com.nt.dao.EmployeeDAOImpl;
import com.nt.dao.IEmployeeDAO;

public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDAO empDao = new EmployeeDAOImpl();
	
	@Override
	public Employee getEmployee(int empId) throws Exception {
		
		System.out.println("EmployeeServiceImpl.getEmployee() called...");
		return empDao.getEmployeeById(empId);
	}

	@Override
	public List<Employee> getAllEmployees() throws Exception {
		
		return empDao.getAll();
	}

}
