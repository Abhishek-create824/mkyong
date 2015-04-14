/**
 * 
 */
package br.com.cams7;

import java.util.logging.Logger;

import br.com.cams7.jpa.domain.BaseEntity;
import br.com.cams7.util.AppUtil;

/**
 * @author cesar
 *
 */
public abstract class AbstractBase<E extends BaseEntity<?>> {

	private final byte ENTITY_ARGUMENT_NUMBER = 0;

	private Logger log;
	/**
	 * Classe da entidade, necessário para o método
	 * <code>EntityManager.find</code>.
	 */
	private Class<E> entityType;

	@SuppressWarnings("unchecked")
	public AbstractBase() {
		super();

		log = Logger.getLogger(this.getClass().getName());
		entityType = (Class<E>) AppUtil
				.getType(this, getEntityArgumentNumber());
	}

	protected byte getEntityArgumentNumber() {
		return ENTITY_ARGUMENT_NUMBER;
	}

	protected Logger getLog() {
		return log;
	}

	protected Class<E> getEntityType() {
		return entityType;
	}

}
