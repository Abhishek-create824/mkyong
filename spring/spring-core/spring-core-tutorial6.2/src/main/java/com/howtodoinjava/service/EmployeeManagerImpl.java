package com.howtodoinjava.service;

import org.springframework.stereotype.Service;

import br.com.cams7.service.BaseServiceImpl;

import com.howtodoinjava.dao.EmployeeDAO;
import com.howtodoinjava.entity.EmployeeEntity;

@Service
public class EmployeeManagerImpl extends
		BaseServiceImpl<EmployeeDAO, EmployeeEntity, Integer> implements
		EmployeeManager {
	// Employee dao injected by Spring context
	// @Autowired
	// private EmployeeDAO employeeDAO;

	public EmployeeManagerImpl() {
		super();
	}

	// This method will be called when a employee object is added
	// @Override
	// @Transactional
	// public void addEmployee(EmployeeEntity employee) {
	// employeeDAO.addEmployee(employee);
	// }

	// This method return list of employees in database
	// @Override
	// @Transactional
	// public List<EmployeeEntity> getAllEmployees() {
	// return getRepository().getAllEmployees();
	// }

	// Deletes a employee by it's id
	// @Override
	// @Transactional
	// public void deleteEmployee(Integer employeeId) {
	// employeeDAO.deleteEmployee(employeeId);
	// }

	// This setter will be used by Spring context to inject the dao's instance
	// public void setEmployeeDAO(EmployeeDAO employeeDAO) {
	// this.employeeDAO = employeeDAO;
	// }
}
