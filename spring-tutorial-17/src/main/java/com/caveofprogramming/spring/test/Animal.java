package com.caveofprogramming.spring.test;

public class Animal {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String type;
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}
	

}
