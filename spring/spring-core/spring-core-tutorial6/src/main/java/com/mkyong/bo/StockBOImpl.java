package com.mkyong.bo;

import org.springframework.stereotype.Service;

import br.com.cams7.service.BaseServiceImpl;

import com.mkyong.dao.StockDAO;
import com.mkyong.model.Stock;

@Service
public class StockBOImpl extends BaseServiceImpl<StockDAO, Stock, Long>
		implements StockBO {

	public StockBOImpl() {
		super();
	}

	public Stock findByStockCode(String stockCode) {
		return getRepository().findByStockCode(stockCode);
	}

}