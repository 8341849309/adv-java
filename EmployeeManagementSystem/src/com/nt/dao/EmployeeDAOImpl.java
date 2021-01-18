package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nt.bo.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {

	private Connection con = null;
	private PreparedStatement ps = null;
	
	/*
	 * Retrieves all employee records in the EMPLOYEE table in the AdvJava Schema
	 */
	
	String GET_ALL_EMPLOYEES="SELECT * FROM EMPLOYEE";
	@Override
	public List<Employee> getAll() throws Exception {
		
		List<Employee> emps = new ArrayList<Employee>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "root");

		ps = con.prepareStatement(GET_ALL_EMPLOYEES);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			Employee employee= new Employee();
			employee.setEmpId(Integer.parseInt(rs.getString(1)));
			employee.setEmpName(rs.getString(2));
			employee.setUsername(rs.getString(7));
			employee.setPassword(rs.getString(8));
			employee.setAddress(rs.getString(3));
			employee.setPhone(rs.getLong(4));
			employee.setEmail(rs.getString(5));
			employee.setSalary(rs.getFloat(6));
			
			emps.add(employee);
		}
		
		System.out.println("All Employees:: "+emps);
		return emps;
	}

	/*
	 * This method returns Employee Details from EMPLOYEE table based on given EMPLOYEE ID
	 */
	String GET_EMPLOYEE = "SELECT * FROM EMPLOYEE WHERE EMPID=?";
	@Override
	public Employee getEmployeeById(int empId) throws Exception {

		Employee employee = new Employee();

		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "root");

		ps = con.prepareStatement(GET_EMPLOYEE);
		ps.setLong(1, empId);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			employee.setEmpId(empId);
			employee.setEmpName(rs.getString(2));
			employee.setUsername(rs.getString(7));
			employee.setPassword(rs.getString(8));
			employee.setAddress(rs.getString(3));
			employee.setPhone(rs.getLong(4));
			employee.setEmail(rs.getString(5));
			employee.setSalary(rs.getFloat(6));
		}

		System.out.println("Employee Details:: "+employee);
		return employee;
	}

}
