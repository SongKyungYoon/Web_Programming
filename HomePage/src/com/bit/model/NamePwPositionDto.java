package com.bit.model;

import java.io.Serializable;

public class NamePwPositionDto implements Serializable {

	private String name;	
	private String pw;
	private String position;
	
 	public NamePwPositionDto(){
		
	}
 	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
 	
}
