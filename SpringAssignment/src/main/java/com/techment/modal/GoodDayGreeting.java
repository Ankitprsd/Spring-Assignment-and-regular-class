package com.techment.modal;

import org.springframework.stereotype.Component;


@Component
public class GoodDayGreeting implements IGreeting {

	String greeting="Have a good day";
	
	

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
//	 * @return 
//	 */
//	public String setGreeting(String greeting) {
//		return this.greeting = greeting;
//	}


//
//	/**
//	 * @param greeting
//	 */
//	public GoodDayGreeting(String greeting) {
//		super();
//		this.greeting = greeting;
//	}



	public String greet() {
		// TODO Auto-generated method stub
		
//	     System.out.println("Have a good day");
//		GoodDayGreeting gdg = new GoodDayGreeting(greeting);
//		gdg.setGreeting("Have a good day");
		return greeting;
		
		
		

	}

}
