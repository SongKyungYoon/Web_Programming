package com.song;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ex04")
public class ex04 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String textType = "text/html; charset=UTF-8";
		request.setCharacterEncoding("UTF-8");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType(textType);
		PrintWriter out = response.getWriter();
		int num = Integer.parseInt(request.getParameter("cnt"));
		
		for (int i =0; i<num; i++) {
			out.print("<h"+(i+1)+">hello</h"+(i+1)+">");
		}
	}

}
