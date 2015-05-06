package com.mkyong.bo;

import com.mkyong.model.Product;

import br.com.cams7.service.BaseService;

public interface ProductBO extends BaseService<Product, Long> {

	// this method need to be transactional
	void save(Product product, int qoh);

}
