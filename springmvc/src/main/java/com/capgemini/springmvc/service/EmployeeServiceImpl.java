package com.capgemini.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springmvc.bean.EmployeePrimaryInfo;
import com.capgemini.springmvc.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;
	
	
	@Override
	public List<EmployeePrimaryInfo> getAllEmployeeInfo() {
		return dao.getAllEmployeeInfo();
	}

	@Override
	public EmployeePrimaryInfo getEmployeeDetail(int id) {
		
		return dao.getEmployeeDetail(id);
	}

	@Override
	public boolean createEmployeeInfo(EmployeePrimaryInfo info) {
		return dao.createEmployeeInfo(info);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeePrimaryInfo info) {
		// TODO Auto-generated method stub
		return dao.updateEmployeeInfo(info);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeInfo(id);
	}

}
