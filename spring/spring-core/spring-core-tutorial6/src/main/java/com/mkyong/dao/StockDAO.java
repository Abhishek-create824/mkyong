package com.mkyong.dao;

import br.com.cams7.jpa.repository.BaseRepository;

import com.mkyong.model.Stock;

public interface StockDAO extends BaseRepository<Stock, Long> {
	Stock findByStockCode(String stockCode);
}