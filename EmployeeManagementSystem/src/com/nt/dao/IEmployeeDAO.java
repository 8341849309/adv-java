package com.nt.dao;

import java.util.List;

import com.nt.bo.Employee;

public interface IEmployeeDAO {

	public Employee getEmployeeById(int empId) throws Exception;

	public List<Employee> getAll() throws Exception;
	
}
