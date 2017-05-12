package com.sk.service;

import com.sk.bo.StudentBO;
import com.sk.dao.StudentDAO;
import com.sk.dto.StudentDTO;

public class StudentInsertServiceImpl implements StudentInsertService {

	private StudentDAO dao;
	/**
	 * @param dao the dao to set
	 */
	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}
	@Override
	public String register(StudentDTO dto) {
		//convert DTO object to BO obj
		StudentBO sbo=new StudentBO();
		sbo.setSno(dto.getSno());
		sbo.setSname(dto.getSname());
		sbo.setAddrs(dto.getAddrs());
		//use DAO
		int cnt=dao.registerStudent(sbo);
		if(cnt==0)
			return "Student Registration Fail";
		else
			
			return "Student Registration Succeded with no"+sbo.getSno();
	}

}
