package com.caveofprogramming.spring.test;

public class Person {
	
	private int id;
	private String name;
	
	public Person(){
		
	}
	
	
	public void speak(){
		System.out.println("Hell I am a person");
	}


	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	

}
