package com.howtodoinjava.dao;

import br.com.cams7.jpa.repository.BaseRepository;

import com.howtodoinjava.entity.EmployeeEntity;

public interface EmployeeDAO extends BaseRepository<EmployeeEntity, Integer> {
	// This method will be called when a employee object is added
	// public void addEmployee(EmployeeEntity employee);

	// This method return list of employees in database
	// public List<EmployeeEntity> getAllEmployees();

	// Deletes a employee by it's id
	// public void deleteEmployee(Integer employeeId);
}