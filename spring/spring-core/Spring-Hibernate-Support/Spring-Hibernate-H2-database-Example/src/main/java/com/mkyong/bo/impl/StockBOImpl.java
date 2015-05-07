package com.mkyong.bo.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cams7.service.BaseServiceImpl;

import com.mkyong.bo.StockBO;
import com.mkyong.dao.StockDAO;
import com.mkyong.model.Stock;

@Service
public class StockBOImpl extends BaseServiceImpl<StockDAO, Stock, Long>
		implements StockBO {

	public StockBOImpl() {
		super();
	}

	@Transactional
	public Stock findByStockCode(String stockCode) {
		return getRepository().findByStockCode(stockCode);
	}

}