package com.caveofprogramming.spring.test;

	/*
	 * 
	 * Dummy implementation of logger
	 */


public class Logger {

	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	

	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeConsole(String text){
		consoleWriter.write(text);
	}
	
	public void writeFile(String text){
		fileWriter.write(text);
	}
	
	

}
