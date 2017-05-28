package com.caveofprogramming.spring.test;

public interface LogWriter { //common to use interfaces in spring
	////good when you have a property that expects an interfce type youc an inject any implementong type into that property
	
	public void write(String text);

}
