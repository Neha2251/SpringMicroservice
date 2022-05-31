package com.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public void saveOrder(OrderVO order) {
		System.out.println("order is getting saaved "+order.getEmail());
		orderRepository.save(order);
		//restTemplate.getForEntity("http://localhost:8082/email", String.class);
		//restTemplate.getForEntity("http://EMAIL-SERVICE/email", String.class);
		restTemplate.postForEntity("http://EMAIL-SERVICE/email","neha",String.class);
		System.out.println(restTemplate);
	}

	public List<OrderVO> getOrders() {
		restTemplate.getForEntity("http://EMAIL-SERVICE/email", String.class);
		return orderRepository.findAll();
	}

}
