package com.bit.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.model.NoticeBoardDao;
import com.bit.model.NoticeBoardDto;
@WebServlet("/NoticeBoardController")
public class NoticeBoardController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<NoticeBoardDto> dblist = null;	//Data Base에 저장된 글정보를 저장한다
		NoticeBoardDto dto = null;//dead code?
		NoticeBoardDao dao = new NoticeBoardDao();
		
		dblist = dao.outpueData();
		 
		 request.getSession().setAttribute("dblist", dblist);
		 response.sendRedirect("noticeboard.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("name");
		String userId	= (String) session.getAttribute("id");
		
		String writer = request.getParameter("writer");	//글쓴이 유저 이름
		String id = request.getParameter("id"); //글쓴이 유저 ID
		
		if(writer.equals(userName) && id.equals(userId)) {
			String title = request.getParameter("title");//글 제목
			String[] tempDate = request.getParameter("date").split("-");//글 작성일자
			String date = "";	//DB 입력형식으로 변환
			for (int i = 0; i<tempDate.length;i++) {
				date +=tempDate[i];
			}
			String text = request.getParameter("text");//글 내용
			
			NoticeBoardDao dao = new NoticeBoardDao();
			dao.inputData(writer, id, title, date, text);
			List<NoticeBoardDto> dblist = dao.outpueData();
			request.getSession().setAttribute("dblist",dblist);
			response.sendRedirect("noticeboard.jsp");

			
		}else {
			if(!(writer.equals(userName))) {	//로그인한 사람과 작성자가 일치 하지 않을 경우
				request.setAttribute("name", "* 이름을 확인해주세요 *");
				RequestDispatcher dispatcher = request.getRequestDispatcher("writingPage.jsp");
				dispatcher.forward(request, response);
			}else if(!(id.equals(userId))) {	//로그인시 사용한 아이디와 일치 하지 않을 경우
				request.setAttribute("id", "* 로그인 아이디를 확인해 주세요 *");
				RequestDispatcher dispatcher = request.getRequestDispatcher("writingPage.jsp");
				dispatcher.forward(request, response);
			}
		}
	}
}
