package com.song;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.net.SocketStatus;

@WebServlet("/ex03")
public class ex03 extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("ex03 초기화");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 response.setCharacterEncoding("UTF-8");
		 response.setContentType("text/html; charset=UTF-8");
		 PrintWriter out = response.getWriter();
		out.print("<h1>"+request.getParameter("text")+"</h1>");	//String type return
		System.out.println("ex03 실행중");
	 }
																																																																																																					
	@Override
	public void destroy() {
		System.out.println("ex03 종료");
	}
}
