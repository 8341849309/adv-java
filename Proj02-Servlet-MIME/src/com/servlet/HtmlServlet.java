package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HtmlServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// response type
		resp.setContentType("text/html");
		resp.setIntHeader("refresh", 10);
		
		// Print write Obj
		PrintWriter out = resp.getWriter();
		
		// Write output message to response obj
		out.println("<table border='1' bgcolor='cyan' align='center'>");
		out.println("<tr><th>Team name</th><th>Team Owner</th><th>Team Captain</th></tr>");
		out.println("<tr><td>MI</td><td>Reliance</td><td>Rohit Sharma</td>");
		out.println("<tr><td>DC</td><td>GMR-JSW</td><td>Shreyas Iyer</td>");
		out.println("<tr><td>KIXP</td><td>Preity Zinta</td><td>KL Rahul</td>");
		out.println("<tr><td>CSK</td><td>Srinivasan</td><td>MS Dhoni</td>");
		out.println("<tr><td>SRH</td><td>Sun Network</td><td>David Warner</td>");
		out.println("<tr><td>KKR</td><td>Sharkh Khan</td><td>Eoin morgan</td>");
		out.println("</table");
		
		out.close();
	}//Service

}//Class
