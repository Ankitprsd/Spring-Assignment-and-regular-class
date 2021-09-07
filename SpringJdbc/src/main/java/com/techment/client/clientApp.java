package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class clientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();

	}

}
