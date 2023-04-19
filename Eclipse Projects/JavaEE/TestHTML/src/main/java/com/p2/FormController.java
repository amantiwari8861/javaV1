package com.p2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fname = request.getParameter("fn");
		String lname = request.getParameter("ln");
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		
		PrintWriter out = response.getWriter();
		Calculator calc=new Calculator();
		int result = calc.q10(num1, num2);
		out.print("<h1>the result is "+result+"</h1>");
		
//		out.print("<h1>User given </h1>");
//		out.print("First Name :"+fname+"<br>");
//		out.print("Last Name :"+lname+"<br>");
//		out.print("Num1 :"+num1+"<br>");
//		out.print("Num2 :"+num2+"<br>");
//		out.print("The sum is "+(num1+num2));
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		doGet(request, response);
//		int num = Integer.parseInt(request.getParameter("num"));
////		Calculator calc=new Calculator();
////		calc.q10(num);
//		response.setContentType("text/html");
//		
//		PrintWriter out = response.getWriter();
//		out.print("the number is "+num+"<br>");
//		
//		int temp1=num,len=0,sumEven=0,sumOdd=0,rem;
//		
//		while(num>0)
//		{
//			num = num/10;
//			len++;
//		}
//		
//		out.print("length is "+len);
//		
//		while(temp1!=0)
//		{
//			rem=temp1%10;
//			if(rem%2 == 0)
//			{
//				sumEven=sumEven+rem;
//			}
//			else
//			{
//				sumOdd=sumOdd+rem;
//			}
//			temp1=temp1/10;
//		}
//		
//		out.print("<br> sum of Even :"+sumEven+" sum of Odd :"+sumOdd+"<br>");
//		
//		int t1=sumOdd,t2=sumEven,t3;
//		out.print("<h1> Fibonnaci Series : "+sumOdd+" "+sumEven+" ");
//		for(int i=0;i<len-2;i++)
//		{
//			t3=t1+t2;
//			out.print(t3+" ");
//			t1=t2;
//			t2=t3;
//		}
//		out.print("</h1>");
	}
}
