package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.command.RegisterCommand;

public class RegisterController extends AbstractWizardFormController{

	@Override
	public ModelAndView processFinish(HttpServletRequest req, HttpServletResponse res, Object cmd,
			BindException be) throws Exception {
		RegisterCommand command=null;
		//type casting
		command=(RegisterCommand) cmd;
		
		//create and return MAV obj
		
		return new ModelAndView("result","res",command);
	}
	@Override
	public ModelAndView processCancel(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException be) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("welcome");
	}
}
