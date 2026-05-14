package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletDemo
 */
@WebServlet("/demo")
public class HttpServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		LocalDate localDate=LocalDate.now();
		String date=localDate.getDayOfMonth()+"-----"+localDate.getMonthValue()
		+"------"+localDate.getYear();
		LocalTime localTime=LocalTime.now();
		String time=localTime.getHour()+"-----"+localTime.getMinute()+"------"
				+localTime.getSecond();
		out.println("<html><body><h1 style='color:blue' align='center'>");
		out.println("Hello User ");
		out.println("Date : "+date+"<br>");
		out.println("Time : "+time);
		out.println("</h1></body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("inside doPost()");
		out.close();
	}

}
