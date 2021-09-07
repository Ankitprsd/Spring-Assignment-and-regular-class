package com.techment.modal;

import org.springframework.stereotype.Component;


@Component
public class MorningGreeting implements IGreeting {
	
	String greeting="Good Morning";
	
	

//	/**
//	 * @return the greeting
//	 */
//	public String getGreeting() {
//		return greeting;
//	}
//
//
//
//	/**
//	 * @param greeting the greeting to set
//	 */
//	public void setGreeting(String greeting) {
//		this.greeting = greeting;
//	}
//
//
//
//	/**
//	 * @param greeting
//	 */
//	public MorningGreeting(String greeting) {
//		super();
//		this.greeting = greeting;
//	}



	public String greet() {
		// TODO Auto-generated method stub
	
//		System.out.println("Good Morning");
//		MorningGreeting morninggreeting = new MorningGreeting(greeting);
//		morninggreeting.setGreeting("Good Morning");
		return greeting;
      
	}

}
