package com.capgemini.springmvc.service;

import java.util.List;

import com.capgemini.springmvc.bean.EmployeePrimaryInfo;

public interface EmployeeService {
	List<EmployeePrimaryInfo> getAllEmployeeInfo();
	EmployeePrimaryInfo getEmployeeDetail(int id);
	boolean createEmployeeInfo(EmployeePrimaryInfo info);
	boolean updateEmployeeInfo(EmployeePrimaryInfo info);
	boolean deleteEmployeeInfo(int id);
}
