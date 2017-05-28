package com.caveofprogramming.spring.test;

import java.util.HashMap;
import java.util.Map;

public class Jungle {
	
	private Map<String, Animal> animals= new HashMap<String, Animal>();
	private Map<String, String> foods = new HashMap<String, String>();
	
	
	public void setFoods(Map<String, String> foods){
		this.foods = foods;
	}
	
	public void setAnimals(Map<String, Animal> animals){
		this.animals = animals;
	}
	
	@Override
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String, String> entry: foods.entrySet()){ //normal iteration through a map
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		sb.append("\n");
		
		for(Map.Entry<String, Animal> entry: animals.entrySet()){ //normal iteration through a map
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	}
	
}
