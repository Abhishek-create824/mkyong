package com.mkyong.dao.impl;

import org.springframework.stereotype.Repository;

import com.mkyong.dao.ProductQohDAO;
import com.mkyong.model.ProductQoh;

import br.com.cams7.jpa.repository.BaseRepositoryImpl;

@Repository
public class ProductQohDAOImpl extends BaseRepositoryImpl<ProductQoh, Long>
		implements ProductQohDAO {

	public ProductQohDAOImpl() {
		super();
	}

}
