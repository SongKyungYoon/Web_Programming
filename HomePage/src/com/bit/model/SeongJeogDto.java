package com.bit.model;

import java.io.Reader;
import java.io.Serializable;

public class SeongJeogDto implements Serializable {
	
	private String name;
	private String group;
	private int java;
	private int database;
	private int framework;
	
	public SeongJeogDto() {
		
	}

	public SeongJeogDto(String name, String group, int java, int database, int framework) {

		this.name = name;
		this.group = group;
		this.java = java;
		this.database = database;
		this.framework = framework;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDatabase() {
		return database;
	}

	public void setDatabase(int database) {
		this.database = database;
	}

	public int getFramework() {
		return framework;
	}

	public void setFramework(int framework) {
		this.framework = framework;
	}

	@Override
	public String toString() {
		return "SeongJeogDto [name=" + name + ", group=" + group + ", java=" + java + ", database=" + database
				+ ", framework=" + framework + "]";
	}
	
}
