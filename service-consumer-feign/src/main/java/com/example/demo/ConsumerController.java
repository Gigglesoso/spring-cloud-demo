package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	
	@Autowired
	private HelloRemote helloRemote;
	
	@RequestMapping(value="/helloRemote/{name}")
	public String helloRemote(@PathVariable("name") String name) {
		return helloRemote.hello(name);
	}
}
