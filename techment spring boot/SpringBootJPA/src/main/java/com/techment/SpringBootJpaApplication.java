package com.techment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

	@Autowired
	IProductdao 
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
	
	@override
	public void run(String...args) throws Exception{
		System.out.println("this is my first spring boot project");
		
	}

}
