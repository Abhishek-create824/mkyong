package com.mkyong.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mkyong.bo.ProductBO;
import com.mkyong.bo.ProductQohBO;
import com.mkyong.dao.ProductDAO;
import com.mkyong.model.Product;
import com.mkyong.model.ProductQoh;

import br.com.cams7.service.BaseServiceImpl;

@Service
public class ProductBOImpl extends BaseServiceImpl<ProductDAO, Product, Long>
		implements ProductBO {

	@Autowired
	private ProductQohBO productQohBo;

	public ProductBOImpl() {
		super();
	}

	@Transactional
	public void save(Product product, int qoh) {
		getRepository().save(product);
		System.out.println("Product Inserted");

		ProductQoh productQoh = new ProductQoh();
		productQoh.setProduct(new Product(product.getId()));
		productQoh.setQty(qoh);

		productQohBo.save(productQoh);
		System.out.println("ProductQoh Inserted");
	}

}
