package com.mkyong.stock.bo;

import com.mkyong.stock.model.Stock;

public interface StockBO {

	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);
}