package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//import com.techment.modal.GoodDayGreeting;
import com.techment.modal.IGreeting;
//import com.techment.modal.MorningGreeting;

@Service
public class GreeterService {
	
	
	@Autowired
	@Qualifier("goodDayGreeting")
	IGreeting igreeting;
	
//	@Autowired
//	GoodDayGreeting gooddaygreeting;
//	
//	@Autowired
//	MorningGreeting morninggreeting;
//	
	
	public void printGreet()
	{
	   System.out.println( igreeting.greet());
//		morninggreeting.greet();
	}

}
