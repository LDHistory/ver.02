package com.user.db;

// DB ����
public interface UserDAO {
	public boolean userLogin(UserDTO dto) throws Exception;
	
	public void userJoin(UserDTO dto) throws Exception;
}
