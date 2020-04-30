package com.capgemini.springmvc.dao;

import java.util.List;

import com.capgemini.springmvc.bean.EmployeePrimaryInfo;

public interface EmployeeDAO {
	EmployeePrimaryInfo authenticate(int empId,String password);
	List<EmployeePrimaryInfo> getAllEmployeeInfo();
	EmployeePrimaryInfo getEmployeeDetail(int id);
	boolean createEmployeeInfo(EmployeePrimaryInfo info);
	boolean updateEmployeeInfo(EmployeePrimaryInfo info);
	boolean deleteEmployeeInfo(int id);
}
