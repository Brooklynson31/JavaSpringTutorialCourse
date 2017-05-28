package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml"); //name of the xml file to read is the paramter
									//dont need to give the method a path since it is in the root folder of the project
									//creates your spring bean containter, can now use that container to get beans from it
		Jungle jungle = (Jungle)context.getBean("jungle");
		System.out.println(jungle);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
