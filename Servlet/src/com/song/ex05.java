package com.song;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/ex05")
public class ex05 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		
		String id =request.getParameter("id");
		String pw =request.getParameter("pw");
		String submit=request.getParameter("submit");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		if(submit.equals("등록")) {
			session.setAttribute("session_id", id);
			session.setAttribute("session_pw", pw);
			
			response.sendRedirect("informInput.html");
			
		}else if(submit.equals("보기")) {
			String session_id = (String) session.getAttribute("session_id");
			String session_pw = (String) session.getAttribute("session_pw");
			out.print("<p> Session ID:"+session_id+"</p>");
			out.print("<p> Session PW:"+session_pw+"</p>");
		}
		
	}

}
