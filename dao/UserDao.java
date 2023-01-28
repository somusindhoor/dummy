package com.ty.hospital.dao;
import java.util.List;
import com.ty.hospital.dto.User;

public interface UserDao {

	public User saveUser(User user);
	public boolean deleteUserById(int uid);
	
	public User getUserById(int uid);
	public List<User> getAllUser();
	public User getUserByName(String uname);
	public User getUserByRole(String role);
}
