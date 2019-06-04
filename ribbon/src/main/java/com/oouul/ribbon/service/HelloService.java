package com.oouul.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String sayHello() {
        return  restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=1&b=2", String.class).getBody();
    }

    public String addServiceFallback() {
        return "error";
    }
}
