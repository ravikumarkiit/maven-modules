package com.ravi.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ravi.tutorial.HelloWorld;

public class App {

	 public static void main( String[] args )
	    {
	    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	    	 
	        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	        obj.printHello();
	        
	    }
}
