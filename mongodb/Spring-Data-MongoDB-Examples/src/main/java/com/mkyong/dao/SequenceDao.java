package com.mkyong.dao;

import com.mkyong.exception.SequenceException;

public interface SequenceDao {

	long getNextSequenceId(String key) throws SequenceException;

}