package com.tsrnd.javax.suho.training.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsrnd.javax.suho.training.domain.domain.Greeting;

@RestController
public class GreetingController {
	private String template = "Hello, %s!";
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting(String.format(template, name));
	}
}
