/**
 * 
 */
package br.com.cams7.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cams7.jpa.domain.BaseEntity;
import br.com.cams7.jpa.repository.BaseRepository;

/**
 * @author cesar
 *
 */
public abstract class BaseServiceImpl<R extends BaseRepository<E, ID>, E extends BaseEntity<ID>, ID extends Serializable>
		implements BaseService<E, ID> {

	@Autowired
	// @Qualifier("stockDao")
	private R repository;

	public BaseServiceImpl() {
		super();
	}

	public void save(E entity) {
		getRepository().save(entity);
	}

	public void update(E entity) {
		getRepository().update(entity);
	}

	public void delete(E entity) {
		getRepository().delete(entity);
	}

	protected R getRepository() {
		return repository;
	}

}
