package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RibbonService {
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="helloRemoteError")
	public String helloRemote(String name) {
		//使用服务名访问
		return restTemplate.getForObject("http://eureka-producer/hello?name="+name, String.class);
	}
	/**
	 * 该方法为断路器的降级操作方法
	 */
	@SuppressWarnings("unused")
	private String helloRemoteError(String name) {
		return "sorry "+ name+",request error！";
	}
}
