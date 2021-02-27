package com.song;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex02")
public class ex02 extends HttpServlet {
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("ex02 초기화");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		System.out.println("ex02 실행중");
		out.print("<!DOCTYPE html>");
		
		for (int i = 0; i < 10; i++) {
			out.print("<h1>Text Subject : 한글 </h1>");
		}
	}
	@Override
	public void destroy() {
		System.out.println("ex02 종료");
	}
}
