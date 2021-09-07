package com.techment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {
	

	@Autowired
	IProductDao iProductDao;
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootJpaApplication.class,args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Hello this is my first spring program");
		
		List<Product> products =iProductDao.findAll();
		products.forEach(System.out::println);
		
		Optional<Product> product = iProductDao.findById(4);
		if(product.isPresent())
			System.out.println(product.get());
		else
			System.out.println("Not present");
		
		long totalProduct = iProductDao.count();
		System.out.println(totalProduct);
		
		List<Product> prod = iProductDao.findByName("laptop");
		System.out.println(prod);
		
		List<Product> prodList = iProductDao.findByCategory("laptop");
		System.out.println(prodList);
		
		
	}

	
}

	

