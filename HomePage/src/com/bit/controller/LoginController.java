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

import com.bit.model.NamePwPositionDto;
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
		String logout = request.getParameter("logout");	//Home Page에서 로그아웃 요청이 올 경우
		if(logout.equals("로그아웃")) {
			HttpSession session = request.getSession();
			session.removeAttribute("id");
			session.removeAttribute("name");
			session.removeAttribute("position");
			response.sendRedirect("LoginPage.jsp");
		}
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
				 NamePwPositionDto dto = null;
				
					dto = dao.idInformation(id);
					if(pw.equals(dto.getPw()) && position.equals(dto.getPosition())) {
						request.getSession().setAttribute("id", id);
						request.getSession().setAttribute("name", dto.getName());
						request.getSession().setAttribute("position", dto.getPosition());
						response.sendRedirect("MainPage.jsp");
					}else if((dto.getPw() == null) && (dto.getPosition() == null)) {
						request.setAttribute("error"," * 등록되지 않은 아이디 입니다.");
						request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
					}else if(!(pw.equals(dto.getPw())) || !(position.equals(dto.getPosition()))) {
						request.setAttribute("error","비밀번호 또는 직책을 확인해 주세요");
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
		} else if(request.getParameter("button").equals("비회원")) {
			request.getSession().setAttribute("name", "비회원");
			request.getSession().setAttribute("id", "비회원");
			request.getSession().setAttribute("position", "비회원");
			response.sendRedirect("MainPage.jsp");
		}
	}
	
}
