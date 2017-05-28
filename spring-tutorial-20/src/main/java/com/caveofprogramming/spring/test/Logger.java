package com.caveofprogramming.spring.test;

	/*
	 * 
	 * Dummy implementation of logger
	 */


public class Logger {

	private LogWriter consoleWriter;
	private LogWriter fileWriter; //when autowiring by name, This must match the bean id in beans.xml file
								//even though beans are same type, the difference will allow the autowire by name to work

	public void setConsoleWriter(LogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeConsole(String text){
		consoleWriter.write(text);
	}
	
	public void writeFile(String text){
		fileWriter.write(text);
	}
	
	

}
