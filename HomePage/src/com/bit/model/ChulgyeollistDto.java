package com.bit.model;

import java.io.Serializable;

public class ChulgyeollistDto implements Serializable {
	
	private String id;
	private String date;
	private String time;
	private String status;
	
	public ChulgyeollistDto() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
