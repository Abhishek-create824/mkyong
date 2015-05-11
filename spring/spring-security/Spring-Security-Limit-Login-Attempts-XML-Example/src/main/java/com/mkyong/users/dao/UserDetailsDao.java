package com.mkyong.users.dao;

import com.mkyong.users.model.UserAttempts;

public interface UserDetailsDao {
	public void updateFailAttempts(String username);
	public void resetFailAttempts(String username);	
	public UserAttempts getUserAttempts(String username);
}