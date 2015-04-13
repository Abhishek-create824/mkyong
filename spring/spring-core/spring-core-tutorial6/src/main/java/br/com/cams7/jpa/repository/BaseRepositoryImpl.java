package br.com.cams7.jpa.repository;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.cams7.jpa.domain.BaseEntity;

import com.mkyong.util.CustomHibernateDaoSupport;

/**
 * Classe resolve os métodos básicos de cadastro (CRUD) com API da
 * <code>JPA</code>.
 * 
 * @author YaW Tecnologia
 */
public abstract class BaseRepositoryImpl<E extends BaseEntity<ID>, ID extends Serializable>
		extends CustomHibernateDaoSupport implements BaseRepository<E, ID> {

	public BaseRepositoryImpl() {
		super();
	}

	public void save(E entity) {
		Session session = getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(entity);
		tx.commit();
		session.close();
	}

	public void update(E entity) {
		Session session = getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(entity);
		tx.commit();
		session.close();
	}

	public void delete(E entity) {
		Session session = getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.delete(entity);
		tx.commit();
		session.close();
	}

	public void delete(ID id) {
		Session session = getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.delete("id", id);
		tx.commit();
		session.close();
	}

}
