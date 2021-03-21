package com.bit.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RollCall")
public class RollCallController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Date date_now = new Date(System.currentTimeMillis());	//오늘 날짜 정보 추출
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy / MM / dd / HH:mm:ss");	//년 월 일 시 분 초 형태로 형식 지정
		String str = dateFormat.format(date_now); 	//오늘 날짜 정보를 문자열 형태로 변환
		String[] str_ = str.split("/"); //문자'/' 기준으로 자른후 문자열 배열에 저장
		String[] time_ = str_[3].split(":");
		String yy = str_[0];	//year
		String MM = str_[1];	//month
		String dd = str_[2];	//day
		String hh = time_[0];	//hour	
		String mm = time_[1];	//minute
		String ss = time_[2];	//secondary
		String today = yy+"년"+MM+"월"+dd+"일";
		String time = hh+"시"+mm+"분"+ss+"초";
		String attend = null;
		if((request.getParameter("q")!=null) && request.getParameter("q").equals("입실")) {
			today="현재시간 "+today+time+" 입실 하시겠습니까?";
			attend = "입실";
		}else if((request.getParameter("q")!=null) && request.getParameter("q").equals("퇴실")){
			today="현재시간 "+today+time+" 퇴실 하시겠습니까?";
			attend = "퇴실";
		}
		request.setAttribute("attend",attend);
		request.setAttribute("time", str);
		request.setAttribute("today",today);
		request.getRequestDispatcher("./RollCall.jsp").forward(request, response);

	}
}
