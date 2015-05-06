/**
 * 
 */
package br.com.cams7.service;

import java.io.Serializable;
import java.util.List;

import br.com.cams7.jpa.domain.BaseEntity;

/**
 * @author cesar
 *
 */
public interface BaseService<E extends BaseEntity<ID>, ID extends Serializable> {
	void save(E entity);

	void update(E entity);

	void delete(E entity);

	void delete(ID id);
	
	List<E> findAll();
}
