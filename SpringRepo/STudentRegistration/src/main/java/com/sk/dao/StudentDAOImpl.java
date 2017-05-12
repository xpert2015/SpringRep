package com.sk.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sk.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private JdbcTemplate jt;


	/**
	 * @param jt the jt to set
	 */
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	String Query="insert into student3 values(?,?,?)";


	@Override
	public Integer registerStudent(StudentBO studentBO) {
		int count=0;
		count=jt.update(Query, studentBO.getSno(),studentBO.getSname(),studentBO.getAddrs());		
		return count;
	}

}
