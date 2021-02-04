package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterApp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {

		List<String> errList = new ArrayList<String>();
		PrintWriter pw = null;
		try {
			pw = resp.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		;
		try {
			resp.setContentType("text/html");

			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			String vflag = req.getParameter("vflag");

			if (vflag.equals("yes")) {

				pw.println("Election Commission of India");

				if (age > 18) {
					pw.println("<h1 style='color:green;text-align:center'>Mr/Miss/Mrs " + name
							+ " You are eligible for voting");
				} else {
					pw.println("<h1 style='color:green;text-align:center'>Mr/Miss/Mrs " + name
							+ " You are not eligible for voting");

					pw.println("<h1><a href='input.html'>Home</a></h1>");

					pw.close();
				}
			} else {

				if (name.isBlank() || name.length() < 6)
					errList.add("Name Should be greater than 5 chars");
				else if (age == 0)
					errList.add("Age should be greater than zero");
				else {
					pw.println("Election Commission of India");

					if (age > 18) {
						pw.println("<h1 style='color:green;text-align:center'>Mr/Miss/Mrs " + name
								+ " You are eligible for voting");
					} else {
						pw.println("<h1 style='color:green;text-align:center'>Mr/Miss/Mrs " + name
								+ " You are not eligible for voting");

						pw.println("<h1><a href='input.html'>Home</a></h1>");

						pw.close();

				}
			}
			}
		}catch (Exception e) {
			errList.add("Please enter valid details");
		}

		if (!errList.isEmpty()) {
			errList.forEach(msg -> {
				try {
					resp.getWriter().println("<li><span style='color:red'>" + msg + "</span></li>");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
	}
	
}
