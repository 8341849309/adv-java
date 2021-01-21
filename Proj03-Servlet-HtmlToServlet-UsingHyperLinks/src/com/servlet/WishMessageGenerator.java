package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishMessageGenerator extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		PrintWriter pw = resp.getWriter();
		String msg=null;
		
		resp.setContentType("text/html");
		
		if(hour<12)
			msg="Good Morning";
		else if(hour<16)
			msg="Good AfterNoon";
		else if(hour<18)
			msg="Good Evening";
		else
			msg="Good Night";
		
		// Write WishMessage to response 
		pw.println("<h1 style='color:blue;text-align:center'>"+msg+"</h1>");
		pw.println("<a href='http://localhost:8006/Proj03-Servlet-HtmlToServlet-UsingHyperLinks/page.html'>Home</a>");
		
		// Close stream
		pw.close();
		
		
	}

}
