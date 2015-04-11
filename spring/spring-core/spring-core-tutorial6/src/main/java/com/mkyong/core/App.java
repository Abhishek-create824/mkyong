package com.mkyong.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.stock.bo.StockBO;
import com.mkyong.stock.model.Stock;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		StockBO stockBo = (StockBO) context.getBean(StockBO.class);

		/** insert **/
		Stock stock = new Stock();
		stock.setStockCode("7668");
		stock.setStockName("HAIO");
		stockBo.save(stock);

		/** select **/
		Stock stock2 = stockBo.findByStockCode("7668");
		System.out.println(stock2);

		/** update **/
		stock2.setStockName("HAIO-1");
		stockBo.update(stock2);
		System.out.println(stock2);

		/** delete **/
		stockBo.delete(stock2);

		// close resources
		context.close();
	}
}
