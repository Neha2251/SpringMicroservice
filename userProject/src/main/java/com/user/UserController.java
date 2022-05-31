package com.user;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
	

	@Autowired
	UserService service;
	
	
	
	@PostMapping("user")
	@ResponseStatus(code=HttpStatus.CREATED)
	void saveDetail(@Valid @RequestBody UserVO user)
	{
		service.saveUser(user);
		System.out.println("createOrder");
		System.out.println(user.getName());
		
	}
	
	@GetMapping("user")
	public List<UserVO> getOrders()
	{
		return service.getUsers();
	}
	
	
	

}
