package com.bit.model;

import java.sql.Date;

public class NoticeBoardDto {

	private String writer; //글 작성자
	private String id;//글 작성자 ID
	private String title; // 글 제목
	private String text;// 글 내용
	private String date; // 글 쓴 날짜
	
	public NoticeBoardDto() {
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String content) {
		this.text = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
