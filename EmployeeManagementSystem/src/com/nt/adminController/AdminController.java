package com.nt.adminController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.bo.Admin;
import com.nt.bo.Employee;
import com.nt.service.AdminServiceImpl;
import com.nt.service.EmployeeServiceImpl;
import com.nt.service.IAdminService;
import com.nt.service.IEmployeeService;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {

	private IAdminService service = new AdminServiceImpl();
	private IEmployeeService empService = new EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		List<Employee> employees = new ArrayList<Employee>();

		boolean isAdminExists = false;

		try {
			isAdminExists = service.adminExists(username, password);
			if (isAdminExists) {
				
				//res.sendRedirect("admin.jsp");
				
				employees = empService.getAllEmployees();
				req.setAttribute("employees", employees);
				req.getRequestDispatcher("admin.jsp").forward(req, res);
				System.out.println("Admin Exists.." + username);
			} else {
				res.sendRedirect("index.html");
				System.out.println("Admin not exists.." + username);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
