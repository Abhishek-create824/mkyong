package com.mkyong.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.bo.ProductBO;
import com.mkyong.bo.StockBO;
import com.mkyong.model.Product;
import com.mkyong.model.Stock;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanLocations.xml");

		StockBO stockBo = (StockBO) context.getBean(StockBO.class);

		/** insert **/
		Stock stock = new Stock();
		stock.setCode("7668");
		stock.setName("HAIO");
		stockBo.save(stock);

		/** select **/
		Stock stock2 = stockBo.findByStockCode("7668");
		System.out.println(stock2);

		/** update **/
		stock2.setName("HAIO-1");
		stockBo.update(stock2);
		System.out.println(stock2);

		/** delete **/
		stockBo.delete(stock2);

		System.out.println("Done");

		Product product = new Product();
		product.setCode("ABC");
		product.setDesc("This is product ABC");

		ProductBO productBo = (ProductBO) context.getBean(ProductBO.class);
		productBo.save(product, 100);

		// close resources
		context.close();
	}
}
