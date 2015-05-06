package br.com.cams7.jpa.repository;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.cams7.jpa.domain.BaseEntity;

/**
 * Classe resolve os métodos básicos de cadastro (CRUD) com API da
 * <code>JPA</code>.
 * 
 * @author YaW Tecnologia
 */
public abstract class BaseRepositoryImpl<E extends BaseEntity<ID>, ID extends Serializable>
		implements BaseRepository<E, ID> {

	@Autowired
	private SessionFactory sessionFactory;

	public BaseRepositoryImpl() {
		super();
	}

	public void save(E entity) {
		getCurrentSession().save(entity);
	}

	public void update(E entity) {
		getCurrentSession().update(entity);
	}

	public void delete(E entity) {
		getCurrentSession().delete(entity);
	}

	public void delete(ID id) {
		getCurrentSession().delete("id", id);
	}

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}
