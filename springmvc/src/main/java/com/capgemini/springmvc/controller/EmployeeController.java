package com.capgemini.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.bean.EmployeePrimaryInfo;
import com.capgemini.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dataEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dataEditor);

	}

	@GetMapping("/add")
	public String getForm() {
		return "addEmployee";
	}

	@PostMapping("/added")
	public String submitForm(EmployeePrimaryInfo info, ModelMap map) {
		boolean added = service.createEmployeeInfo(info);
		if (added) {
			return "hello";
		} else {
			return "addEmployee";
		}
	}// End Of Submit Form

	@GetMapping("/search")
	public String getSearchForm() {
		return "searchEmp";
	}

	@GetMapping("/searchEmployee")
	public String getDetail(int empId, ModelMap map) {
		EmployeePrimaryInfo bean = service.getEmployeeDetail(empId);
		if (bean != null) {
			map.addAttribute("bean", bean);
			return "search";
		} else {
			return "searchEmp";
		}

	}

	@GetMapping("/delete")
	public String getdeleteForm() {
		return "deleteEmp";
	}

	@GetMapping("/deleteEmployee")
	public String deleted(int empId, ModelMap map) {
		boolean deleted = service.deleteEmployeeInfo(empId);
		if (deleted) {
			map.addAttribute("hello", "Record Deleted");
			return "hello";
		}
		return "deleteEmp";
	}// End Of Delete

	@GetMapping("/getAll")
	public String getGetAll() {
		return "getDetails";
	}

	@GetMapping("/getAllEmployee")
	public String getAllEmployee(ModelMap map) {
		List<EmployeePrimaryInfo> allRecord = service.getAllEmployeeInfo();
		map.addAttribute("list", allRecord);
		return "getAllEmployee";
	}
	@GetMapping("/update")
	public String getUpdateForm() {
	return "update";
}
	@GetMapping("/updateEmployee")
	public String getUpdateEmployee(EmployeePrimaryInfo info,ModelMap map) {
		boolean updated = service.updateEmployeeInfo(info);
		if(updated) {
			map.addAttribute("hello", "Record updated");
			return "hello";
		}else {
			return "updateEmployee";
		}
	}
	

}// End Of The Class
