package com.caveofprogramming.spring.test;

public class Person {
	
	private int id;
	private String name;
	private Address address;
	private int taxId;
	
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}


	public Person(){
		
	}
	
	
	public void speak(){
		System.out.println("Hell I am a person");
	}


	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", taxId=" + taxId + "]";
	}


	


	
	

}
