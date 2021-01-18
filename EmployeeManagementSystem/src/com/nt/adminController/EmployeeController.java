package com.nt.adminController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.bo.Employee;
import com.nt.service.EmployeeServiceImpl;
import com.nt.service.IEmployeeService;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {

	private IEmployeeService empService = new EmployeeServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Employee employee = null;
		
		int empId = Integer.parseInt(req.getParameter("empId"));
		
		System.out.println("Employyee Id:: "+empId);
		
		try {
			employee = empService.getEmployee(empId);
			req.setAttribute("emp", employee);
			
			RequestDispatcher rd=req.getRequestDispatcher("admin.jsp");
			rd.forward(req, res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
