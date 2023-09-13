package com.app.raghu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.consumer.CartConsumerFeign;

@RestController
@RequestMapping("/order")
public class OrderRestController {
	@Autowired
	private CartConsumerFeign consumer;
	@GetMapping("/place")
	public ResponseEntity<String> placeOder(){
		String cartResp=consumer.showMsg().getBody();
		return ResponseEntity.ok("ORDER PLACED WITH =>" + cartResp);
	}

}
