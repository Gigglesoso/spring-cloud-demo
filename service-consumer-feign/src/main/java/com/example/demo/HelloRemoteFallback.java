package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * 该类实现了Feign调用的接口，重写的其中的方法，用来作为fallback的执行类
 * 在接口类中的@FeignClient注解增加fallback属性指定该类即可
 */
@Component
public class HelloRemoteFallback implements HelloRemote{

	@Override
	public String hello(String name) {
		return "sorry "+name+",request error!";
	}

}
