package com.mkyong.stock.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mkyong.stock.dao.StockDAO;
import com.mkyong.stock.model.Stock;

@Repository("stockDao")
public class StockDAOImpl implements StockDAO {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	public void save(Stock stock) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(stock);
		tx.commit();
		session.close();
	}

	public void update(Stock stock) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(stock);
		tx.commit();
		session.close();
	}

	public void delete(Stock stock) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(stock);
		tx.commit();
		session.close();
	}

	public Stock findByStockCode(String stockCode) {
		Session session = this.sessionFactory.openSession();
		List<?> list = session
				.createQuery("from Stock where stockCode=:stockCode")
				.setString("stockCode", stockCode).list();
		session.close();
		return (Stock) list.get(0);

	}

}