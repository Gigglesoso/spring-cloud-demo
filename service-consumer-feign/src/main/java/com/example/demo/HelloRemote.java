package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@FeignClient(name="eureka-producer",fallback=HelloRemoteFallback.class)   //这里的name是对应的服务提供者的spring.application.name,也是服务提供者在注册中心注册时的名称
									                                      //这里相当于服务提供者的远程调用接口，其实内部实现是webservice借口	
public interface HelloRemote {
	@RequestMapping(value="/hello")    //调用的远程的服务中的那个方法
	public String hello(@RequestParam(value = "name") String name);  //这里定义的方法名称要和服务提供者中定义的方法名称及参数一致
}
