package com.spring.authentication.services;

import com.spring.authentication.models.User;

public interface UserService {
	public User findUserByEmail(String email);

	public void saveUser(User user);
}
