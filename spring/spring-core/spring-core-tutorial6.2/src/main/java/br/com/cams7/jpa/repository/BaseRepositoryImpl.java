package br.com.cams7.jpa.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.cams7.AbstractBase;
import br.com.cams7.jpa.domain.BaseEntity;

/**
 * Classe resolve os métodos básicos de cadastro (CRUD) com API da
 * <code>JPA</code>.
 * 
 * @author YaW Tecnologia
 */
public abstract class BaseRepositoryImpl<E extends BaseEntity<ID>, ID extends Serializable>
		extends AbstractBase<E> implements BaseRepository<E, ID> {

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
		@SuppressWarnings("unchecked")
		E entity = (E) getCurrentSession().load(getEntityType(), id);
		if (entity != null)
			delete(entity);

		// getCurrentSession().delete("id", id);
	}

	public List<E> findAll() {
		@SuppressWarnings("unchecked")
		List<E> list = getCurrentSession().createCriteria(getEntityType())
				.list();
		return list;
	}

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}
