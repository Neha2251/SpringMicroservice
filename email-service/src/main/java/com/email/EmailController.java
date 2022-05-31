package com.email;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@GetMapping("email")
	String sendMail()
	{
		System.out.println("email sent");
		return "send successfully";
		
	}
	
	@PostMapping("email")
	String sendMailUsingPost(String email)
	{
		System.out.println("email sent "+email);
		return "send successfully on ID "+email;
		
	}
	

}
