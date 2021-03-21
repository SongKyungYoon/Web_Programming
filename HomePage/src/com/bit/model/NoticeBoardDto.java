package com.bit.model;

import java.io.Serializable;
import java.sql.Date;

public class NoticeBoardDto implements Serializable {
	
	private String num; //글 번호
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

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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
