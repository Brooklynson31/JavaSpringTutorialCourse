package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml"); //name of the xml file to read is the paramter
		
		Logger logger = (Logger)context.getBean("logger"); //gets loggger bean to use these two methods
		
		logger.writeConsole("Hello there"); //logger requires bean s for Console Writer and FileWriter in order to omplement method
		logger.writeFile("Hi again");
		
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
