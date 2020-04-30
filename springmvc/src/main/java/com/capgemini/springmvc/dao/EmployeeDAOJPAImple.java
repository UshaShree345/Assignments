package com.capgemini.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springmvc.bean.EmployeePrimaryInfo;


@Repository
public class EmployeeDAOJPAImple implements EmployeeDAO {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public EmployeePrimaryInfo authenticate(int empId, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<EmployeePrimaryInfo> getAllEmployeeInfo() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "Select e from EmployeePrimaryInfo e";
		Query query =	manager.createQuery(jpql);
		List<EmployeePrimaryInfo> list= query.getResultList();
		return list;
	}

	@Override
	public EmployeePrimaryInfo getEmployeeDetail(int id) {
		EntityManager manager = factory.createEntityManager();
		EmployeePrimaryInfo employeePrimaryInfo = manager.find(EmployeePrimaryInfo.class, id);
		manager.close();
		return employeePrimaryInfo;
	}

	@Override
	public boolean createEmployeeInfo(EmployeePrimaryInfo info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			isAdded= true;
			System.out.println("Added");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return isAdded;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeePrimaryInfo info) {
		EntityManager manager = factory.createEntityManager();
		EmployeePrimaryInfo employeeInfo = manager.find(EmployeePrimaryInfo.class, info.getEmpId());
		EntityTransaction transaction = manager.getTransaction();
		boolean updated = false;
		if(employeeInfo != null) {
			transaction.begin();
			employeeInfo.setName(info.getName());
			updated = true;
			transaction.commit();
			
		}
		manager.close();
		return updated;
		
	}
	@Override
	public boolean deleteEmployeeInfo(int id) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		EmployeePrimaryInfo primaryInfo = manager.find(EmployeePrimaryInfo.class, id);
		if(primaryInfo != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(primaryInfo);
			transaction.commit();
			isDeleted=true;
			
		}
		manager.close();
		return isDeleted;
	}

	

}
