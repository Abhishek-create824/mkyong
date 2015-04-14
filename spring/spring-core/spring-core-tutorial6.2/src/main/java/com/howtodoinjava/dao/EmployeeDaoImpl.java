package com.howtodoinjava.dao;

import org.springframework.stereotype.Repository;

import br.com.cams7.jpa.repository.BaseRepositoryImpl;

import com.howtodoinjava.entity.EmployeeEntity;

@Repository
public class EmployeeDaoImpl extends
		BaseRepositoryImpl<EmployeeEntity, Integer> implements EmployeeDAO {
	// Session factory injected by spring context
	// @Autowired
	// private SessionFactory sessionFactory;

	public EmployeeDaoImpl() {
		super();
	}

	// This method will be called when a employee object is added
	// @Override
	// public void addEmployee(EmployeeEntity employee) {
	// this.sessionFactory.getCurrentSession().save(employee);
	// }

	// This method return list of employees in database
	// @SuppressWarnings("unchecked")
	// @Override
	// public List<EmployeeEntity> getAllEmployees() {
	// return getCurrentSession().createQuery("from EmployeeEntity").list();
	// }

	// Deletes a employee by it's id
	// @Override
	// public void deleteEmployee(Integer employeeId) {
	// EmployeeEntity employee = (EmployeeEntity) sessionFactory
	// .getCurrentSession().load(EmployeeEntity.class, employeeId);
	// if (null != employee) {
	// this.sessionFactory.getCurrentSession().delete(employee);
	// }
	// }

	// This setter will be used by Spring context to inject the sessionFactory
	// instance
	// public void setSessionFactory(SessionFactory sessionFactory) {
	// this.sessionFactory = sessionFactory;
	// }
}
