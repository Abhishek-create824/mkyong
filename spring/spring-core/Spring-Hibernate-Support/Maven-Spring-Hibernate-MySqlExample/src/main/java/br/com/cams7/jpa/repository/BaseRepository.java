/**
 * 
 */
package br.com.cams7.jpa.repository;

import java.io.Serializable;

import br.com.cams7.jpa.domain.BaseEntity;

/**
 * @author cesar
 *
 */
public interface BaseRepository<E extends BaseEntity<ID>, ID extends Serializable> {

	void save(E entity);

	void update(E entity);

	void delete(E entity);

	void delete(ID id);
}
