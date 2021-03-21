package com.bit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.model.DetailViewDao;
import com.bit.model.DetailViewDto;

@WebServlet("/DetailViewController")
public class DetailViewController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DetailViewDto dto = null;
		DetailViewDao dao = new DetailViewDao();
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");	//로그인 아이디
		String name = (String)session.getAttribute("name");	//로그인한 사람의 이름
		String title = request.getParameter("title");	//QueryString 목록의 'title' 선택시 해당 title 값을 요청한다
		dto = dao.outputData(title);
		if(id.equals(dto.getId()) && name.equals(dto.getWriter())) { // 본인이 쓴 글만 확인 할수 있게 조건문을 명시 
			session.setAttribute("detail",dto);
			response.sendRedirect("DetailViewPage.jsp");
		}else {	//현재 로그인한 계정의 이름과 아이디와 글에 등록된 작성자가 일치 하지 않으면 글을 확인 할 수 없음!
				request.getRequestDispatcher("noticeboard.jsp").forward(request, response);
		}
	}

}
