package com.mkyong.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import br.com.cams7.jpa.repository.BaseRepositoryImpl;

import com.mkyong.model.Stock;

@Repository
public class StockDAOImpl extends BaseRepositoryImpl<Stock, Long> implements
		StockDAO {

	public StockDAOImpl() {
		super();
	}

	public Stock findByStockCode(String stockCode) {
		Session session = getSessionFactory().openSession();
		List<?> list = session.createQuery("from Stock where code=:stockCode")
				.setString("stockCode", stockCode).list();
		session.close();
		return (Stock) list.get(0);
	}

}