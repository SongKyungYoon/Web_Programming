package com.bit.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.model.PwPositionDto;
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
			
			if(id == null || pw == null || position == null) {
				 request.setAttribute("space", " * 입력란 또는 체크란의 공백을 확인해 주세요");
				 request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
			 }else if((id != null) && (pw != null) && (position != null)) {
				 ProfileDao dao = new ProfileDao();
				 PwPositionDto dto = null;
				 try {
					dto = dao.idInformation(id);
					if(pw.equals(dto.getPw()) && position.equals(dto.getPosition())) {
						request.getSession().setAttribute("id", id);
						request.getSession().setAttribute("name", dto.getName());
						request.getSession().setAttribute("position", dto.getPosition());
						System.out.println(request.getSession().getAttribute("id"));
						System.out.println(request.getSession().getAttribute("name"));
						System.out.println(request.getSession().getAttribute("position"));
						System.out.println("로그인 성공");
					}else if(!(pw.equals(dto.getPw())) || !(position.equals(dto.getPosition()))) {
						request.setAttribute("error","아이디 또는 비밀번호 확인해 주세요");
						request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
					}
				} catch (SQLException e) {
					request.setAttribute("error","아이디 또는 비밀번호 확인해 주세요");
					request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
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
				
			try {
				dao.inputData(name, birthday, phoneNumber, id, pw, position);
				response.sendRedirect("LoginPage.jsp");
				
			}catch (SQLException e) {
				request.setAttribute("duplicateId"," * 중복된 아이디 입니다.");
				request.getRequestDispatcher("SignUpForm.jsp").forward(request, response);
			}
		}
	}
	
}
