package com.mkyong.dao.impl;

import org.springframework.stereotype.Repository;

import com.mkyong.dao.ProductDAO;
import com.mkyong.model.Product;

import br.com.cams7.jpa.repository.BaseRepositoryImpl;

@Repository
public class ProductDAOImpl extends BaseRepositoryImpl<Product, Long> implements
		ProductDAO {

	public ProductDAOImpl() {
		super();
	}

}
