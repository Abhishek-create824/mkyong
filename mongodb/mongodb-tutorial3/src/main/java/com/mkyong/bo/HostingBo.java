package com.mkyong.bo;

import com.mkyong.exception.SequenceException;

public interface HostingBo {

	void save(String name) throws SequenceException;

}