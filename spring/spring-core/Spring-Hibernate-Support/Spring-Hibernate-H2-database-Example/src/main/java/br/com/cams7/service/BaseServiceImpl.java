/**
 * 
 */
package br.com.cams7.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.cams7.jpa.domain.BaseEntity;
import br.com.cams7.jpa.repository.BaseRepository;

/**
 * @author cesar
 *
 */
public abstract class BaseServiceImpl<R extends BaseRepository<E, ID>, E extends BaseEntity<ID>, ID extends Serializable>
		implements BaseService<E, ID> {

	@Autowired
	private R repository;

	public BaseServiceImpl() {
		super();
	}

	@Transactional
	public void save(E entity) {
		getRepository().save(entity);
	}

	@Transactional
	public void update(E entity) {
		getRepository().update(entity);
	}

	@Transactional
	public void delete(E entity) {
		getRepository().delete(entity);
	}

	protected R getRepository() {
		return repository;
	}

}
