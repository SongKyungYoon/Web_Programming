package com.song;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sky")	// 어노테이션
public class ex01 extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("ex01 초기화");
	}
	
	@Override
		public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/html; charset=UTF-8");
		
			PrintWriter out = resp.getWriter();	// server socket client request 요청에 대한 response 
			System.out.println("ex01 실행중");
			out.print("<h2>Hello Servlet</h2>");

		}
	@Override
	public void destroy() {
		System.out.println("ex01 종료");
	}
}
