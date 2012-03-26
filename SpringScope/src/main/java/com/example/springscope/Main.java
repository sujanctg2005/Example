package com.example.springscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "app-config.xml" });
		// retrieve configured instance
		User customerA = (User) context.getBean("userService");
		customerA.setId(1);
		customerA.setUserName("Jeff");
		System.out.println(" Customer Info A:" +customerA);
		 // Since Scope is prototype , new instance will be return to caller
		User customerB = (User) context.getBean("userService"); 
		System.out.println(" Customer Info B:" +customerB);   // all fields value will be null
		
		customerB.setId(2);
		customerB.setUserName("Jhon");
		System.out.println(" Customer Info B:" +customerB);  
		
	}

}
