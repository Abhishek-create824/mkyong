package com.mkyong.stock.dao;

import com.mkyong.stock.model.Stock;

public interface StockDAO {

	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);

}