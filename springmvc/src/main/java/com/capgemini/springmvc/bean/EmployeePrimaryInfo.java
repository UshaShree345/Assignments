package com.capgemini.springmvc.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
	@Entity
	@Table(name = "EmployeePrimaryInfo")
	public class EmployeePrimaryInfo implements Serializable {
		@Id
		@Column
		private int empId;
		@Column
		private String name;
		@Column
		private String password;
		@Column
		private String officalEmail;
		@Column
		private long mobileNo;
		@Column
		private String designation;
		@Column
		private String bloodGroup;
		@Column
		private double salary;
		@Column
		private int departmentId;
		
		@Column
		private int managerID;

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getOfficalEmail() {
			return officalEmail;
		}

		public void setOfficalEmail(String officalEmail) {
			this.officalEmail = officalEmail;
		}

		public long getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getBloodGroup() {
			return bloodGroup;
		}

		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public int getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}

		public int getManagerID() {
			return managerID;
		}

		public void setManagerID(int managerID) {
			this.managerID = managerID;
		}
		
}
