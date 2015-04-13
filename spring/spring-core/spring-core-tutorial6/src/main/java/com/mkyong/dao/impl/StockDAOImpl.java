package com.mkyong.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.cams7.jpa.repository.BaseRepositoryImpl;

import com.mkyong.dao.StockDAO;
import com.mkyong.model.Stock;

@Repository
public class StockDAOImpl extends BaseRepositoryImpl<Stock, Long> implements
		StockDAO {

	public StockDAOImpl() {
		super();
	}

	public Stock findByStockCode(String stockCode) {
		List<?> list = getCurrentSession()
				.createQuery("from Stock where code=:stockCode")
				.setString("stockCode", stockCode).list();

		return (Stock) list.get(0);
	}

}