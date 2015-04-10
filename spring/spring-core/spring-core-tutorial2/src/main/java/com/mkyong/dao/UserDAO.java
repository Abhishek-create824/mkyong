package com.mkyong.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO implements DAO {
	@Override
	public String toString() {
		return "Hello , This is UserDAO";
	}
}