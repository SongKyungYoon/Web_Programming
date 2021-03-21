package com.bit.model;

import java.io.Serializable;

public class DetailViewDto implements Serializable {

	private String writer;	//작성자
	private String id;		//작성자 아이디
	private String title;	//글 제목
	private String content;	//글 내용
	
	public DetailViewDto() {
	
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
