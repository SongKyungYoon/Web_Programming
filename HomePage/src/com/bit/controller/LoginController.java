package com.bit.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.IdPwPositionDto;
import com.bit.model.ProfileDao;
import com.oreilly.servlet.MultipartRequest;
@WebServlet("/LoginController") //회원정보 관리 서블릿
public class LoginController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		if(request.getMethod().equals("GET")) doGet(request, response);
		else if(request.getMethod().equals("POST")) doPost(request, response);
		
	}	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("button").equals("로그인")) {
			
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String position = request.getParameter("position");
			
			ProfileDao dao = new ProfileDao();
			
			 List<IdPwPositionDto> list = dao.outputData();
			 
			 for(int i = 0; i<list.size(); i++) {
				String db_name = list.get(i).getName();
				String db_id = list.get(i).getId();
				String db_pw = list.get(i).getPw();
				String db_pos = list.get(i).getPosition();
				
				if(db_id.equals(id) && db_pw.equals(pw) && db_pos.equals(position)) {
					System.out.println(db_name +" 로그인 성공");
				} else if(db_id.equals(id) || db_pw.equals(pw) || db_pos.equals(position)) {
					System.out.println("Login Fail");
				}
			 }
			
		} else if(request.getParameter("button").equals("회원가입")) {
			
			response.sendRedirect("SignUpForm.jsp");
					
		} else if(request.getParameter("button").equals("가입하기")) {
	
			String name = request.getParameter("name");
			String birthday = request.getParameter("birthday");
			String phoneNumber = request.getParameter("phoneNumber");
			String id = request.getParameter("id");
		    String pw = request.getParameter("pw");
			String position = request.getParameter("position");
				
			ProfileDao dao = new ProfileDao();
				
			dao.inputData(name, birthday, phoneNumber, id, pw, position);
				
			response.sendRedirect("LoginPage.jsp");
		}
	}
	
}
