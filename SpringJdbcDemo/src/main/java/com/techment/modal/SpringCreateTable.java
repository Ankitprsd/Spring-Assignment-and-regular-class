package com.techment.modal;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.JDBCType;

public class SpringCreateTable {
	
	JDBCType jt;

	/**
	 * @param jt
	 */
	public SpringCreateTable(JDBCType jt) {
		super();
		this.jt = jt;
	}
	
	public void createTable()
	{
		jt.execute("create table sptest(sno number(3), sname varchar(10))");
		// execute() returns void
		System.out.println("table created");
	}
	

}
