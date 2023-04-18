package com.p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().print("Hii Everyone");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.append("<h1> Hello Aman by doGet</h1>");
		System.out.println("Hii i am get method");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		doGet(request, response);
		System.out.println("post method called");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h1> Hello Aman  by doPost </h1>");
	}

}
