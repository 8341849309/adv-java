package com.nt.service;

import java.util.List;

import com.nt.bo.Employee;

public interface IEmployeeService {

	public Employee getEmployee(int empId) throws Exception;

	public List<Employee> getAllEmployees() throws Exception;
}
