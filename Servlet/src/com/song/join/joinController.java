package com.song.join;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/join")
public class joinController extends HttpServlet {
	
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//			String method =request.getMethod();
//			
//			if(method.equals("GET")) {
//				doGet(request, response);
//			}
//			else if(method.equals("POST")) {
//				doPost(request, response);
//			}
//		
//	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("./joinform.html");
//		dispatcher.forward(request, response);
		response.sendRedirect("./joinform.html");
		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		request.setAttribute("name", name);
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("certify.jsp");
		dispatcher.forward(request, response);
		
	}
	
	

}
