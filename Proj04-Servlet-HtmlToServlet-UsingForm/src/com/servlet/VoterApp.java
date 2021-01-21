package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterApp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			resp.setContentType("text/html");
			PrintWriter pw=resp.getWriter();
			
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			
			pw.println("Election Commission of India");
			
			if(age>18)
				pw.println("<h1 style='color:green;text-align:center'>Mr/Miss/Mrs "+name+" You are eligible for voting");
			else
				pw.println("<h1 style='color:green;text-align:center'>Mr/Miss/Mrs "+name+" You are not eligible for voting");
			
			pw.println("<h1><a href='input.html'>Home</a></h1>");
			
			pw.close();
	}
}
