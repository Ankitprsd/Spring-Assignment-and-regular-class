package com.techment.spring;



public class SpringCreateTable {
	
	JdbcTemplate jt;

	
	



	/**
	 * @param jt the jt to set
	 */
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}






	public void createTable()
	{
		jt.execute("create table sptest(sno number(3), sname varchar(10))");
		// execute() returns void
		System.out.println("table created");
	}
	

}
