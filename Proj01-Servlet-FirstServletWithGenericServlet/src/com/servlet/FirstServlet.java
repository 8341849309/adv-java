package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends GenericServlet {

	static {
		System.out.println("Static method...");
	}

	public FirstServlet() {
		System.out.println("Constructor...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Arg-0:: Init method...");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Arg-1:: Init method");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		System.out.println("service() method execution...");
		PrintWriter out=resp.getWriter();
		out.println("<h1>Welcome Innocent Advanced Java Students</h1>");
		out.println("<h1>The Server Time is:"+new Date()+"</h1>");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy method...");
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}
	
	@Override
	public String getServletInfo() {
		return "Venkateswarlu Velpula";
	}

}