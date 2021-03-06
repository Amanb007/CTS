package com.cognizant.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.DepartmentDao;
import com.cognizant.model.Department;

@Service
public class DepartmentService {
	@Autowired
	DepartmentDao departmentDao;
	
	@Transactional
	public ArrayList<Department> getAllDepartments(){
		return departmentDao.getAllDepartments();
	}
}
