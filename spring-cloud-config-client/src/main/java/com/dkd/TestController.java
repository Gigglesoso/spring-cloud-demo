package com.dkd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("${test}")
	private String test;
	@Value("${spring.datasource.url}")
	private String url;
	@RequestMapping("/test")
	public String test() {
		return test;
	}
	@RequestMapping("/url")
	public String url() {
		return url;
	}
}
