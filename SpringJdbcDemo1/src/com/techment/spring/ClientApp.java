package com.techment.spring;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Resource resource = new ClassPathResource("object.xml");
		    BeanFactory factory = new XmlBeanFactory(resource);
		    
		    JdbcTemplate template = factory.getBean("jdbc Template" ,JdbcTemplate.class);
	
		    SpringCreateTable st =(SpringCreateTable)factory.getBean("id3");
			st.createTable();

	}

}
