package com.song;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ex06")
public class ex06 extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		out.println("<h1>Get 방식으로 전송</h1>");
		out.println("<a href=\"http://localhost:8080/Servlet/GetPost.html \">return</a>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		out.println("<h1>Post 방식으로 전송</h1>");
		out.println("<a href=\"http://localhost:8080/Servlet/GetPost.html \">return</a>");
		
	}

//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//		
//	}

	
	
}
