package com.mkyong.stock.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mkyong.stock.bo.StockBO;
import com.mkyong.stock.dao.StockDAO;
import com.mkyong.stock.model.Stock;

@Service("stockBo")
public class StockBOImpl implements StockBO {

	@Autowired
	@Qualifier("stockDao")
	private StockDAO dao;

	public void save(Stock stock) {
		dao.save(stock);
	}

	public void update(Stock stock) {
		dao.update(stock);
	}

	public void delete(Stock stock) {
		dao.delete(stock);
	}

	public Stock findByStockCode(String stockCode) {
		return dao.findByStockCode(stockCode);
	}
}