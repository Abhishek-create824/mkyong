package com.mkyong.bo;

import br.com.cams7.service.BaseService;

import com.mkyong.model.Stock;

public interface StockBO extends BaseService<Stock, Long> {

	Stock findByStockCode(String stockCode);
}