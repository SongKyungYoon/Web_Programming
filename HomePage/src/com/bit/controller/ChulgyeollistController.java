package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.ChulgyeollistDao;
@WebServlet("/chulgyeollist")
public class ChulgyeollistController extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ChulgyeollistDao dao = new ChulgyeollistDao();
		String id = (String)request.getSession().getAttribute("id");
		String attend = request.getParameter("attend");	
		String time_ = request.getParameter("time");
		String[] date_ = time_.split("/");
		String yy=date_[0].trim();
		String mm=date_[1].trim();
		String dd=date_[2].trim();
		String date = yy+mm+dd;
		String time = date_[3];
		if(attend.equals("입실")) {
			dao.inputData(id, date, time, attend);
		}else {
			dao.inputData(id, date, time, attend);
		}
		response.sendRedirect("MainPage.jsp");
	}
	
	

}