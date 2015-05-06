/**
 * 
 */
package br.com.cams7.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.cams7.AbstractBase;
import br.com.cams7.jpa.domain.BaseEntity;
import br.com.cams7.jpa.repository.BaseRepository;

/**
 * @author cesar
 *
 */
public abstract class BaseServiceImpl<R extends BaseRepository<E, ID>, E extends BaseEntity<ID>, ID extends Serializable>
		extends AbstractBase<E> implements BaseService<E, ID> {

	private final byte ENTITY_ARGUMENT_NUMBER = 1;

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

	@Transactional
	public void delete(ID id) {
		getRepository().delete(id);
	}

	@Transactional(readOnly = true)
	public List<E> findAll() {
		return getRepository().findAll();
	}

	@Override
	protected byte getEntityArgumentNumber() {
		return ENTITY_ARGUMENT_NUMBER;
	}

	protected R getRepository() {
		return repository;
	}

}
