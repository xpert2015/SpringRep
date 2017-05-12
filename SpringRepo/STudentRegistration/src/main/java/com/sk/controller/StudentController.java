package com.sk.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sk.command.StudentCommand;
import com.sk.dto.StudentDTO;
import com.sk.service.StudentInsertService;

public class StudentController extends SimpleFormController {
	private StudentInsertService service;

	/**
	 * @param service the service to set
	 */
	public void setService(StudentInsertService service) {
		this.service = service;
	}
    public 	ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command, BindException errors) throws Exception{
    	//type cast cmd obj
    	StudentCommand cmd=(StudentCommand) command;
    	//convert Command to dto obj
    	StudentDTO dto=new StudentDTO();
    	dto.setSno(cmd.getSno());
    	dto.setSname(cmd.getSname());
    	dto.setAddrs(cmd.getAddrs());
    	//use Service class
    	String result=service.register(dto);
    	//return model and view
    	return new ModelAndView(this.getSuccessView(),"resMsg",result);
    	
    }
	

}
