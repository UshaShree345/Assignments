package com.capgemini.springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SpringExceptionHandler {
	@ExceptionHandler(Exception.class)
	public String exception() {
		return "error";
	}

}
