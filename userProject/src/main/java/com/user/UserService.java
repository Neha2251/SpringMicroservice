package com.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void saveUser(UserVO user) {
		userRepository.save(user);
	}

	public List<UserVO> getUsers() {
		return userRepository.findAll();
	}
	
	public void deleteUser(UserVO user)
	{
		userRepository.delete(user);
	}


}
