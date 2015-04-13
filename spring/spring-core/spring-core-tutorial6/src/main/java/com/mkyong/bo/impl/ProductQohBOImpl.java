package com.mkyong.bo.impl;

import org.springframework.stereotype.Service;

import com.mkyong.bo.ProductQohBO;
import com.mkyong.dao.ProductQohDAO;
import com.mkyong.model.ProductQoh;

import br.com.cams7.service.BaseServiceImpl;

@Service
public class ProductQohBOImpl extends
		BaseServiceImpl<ProductQohDAO, ProductQoh, Long> implements
		ProductQohBO {

	public ProductQohBOImpl() {
		super();
	}

}
