package com.bcs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

	@GetMapping("/hello")
	public String showHelloWorldString() {
		return "Hello Shailendra & Amit" ;
	}
	
}
