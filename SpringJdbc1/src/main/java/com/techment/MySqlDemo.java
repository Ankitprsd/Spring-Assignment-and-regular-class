package com.techment;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MySqlDemo {
	
	JdbcTemplate jdbctemplate;

	
	/**
	 * @param jdbctemplate the jdbctemplate to set
	 */
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	/**
	 * @param ds the ds to set
	 */
	public void setDs(DriverManagerDataSource ds) {
		this.ds = ds;
	}
	
	
	void insertData()
	{
		jdbctemplate.execute("insert into student values(2,'Ankit','Ranchi')");
		System.out.println("Data Inserted");
	}
	
DriverManagerDataSource ds;
}
