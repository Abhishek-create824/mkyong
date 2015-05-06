package com.mkyong.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO implements DAO {
	@Override
	public String toString() {
		return this.getClass().getName() + " []";
	}
}