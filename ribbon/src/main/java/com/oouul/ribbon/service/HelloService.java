package com.oouul.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    private final RestTemplate restTemplate;

    @Autowired
    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String sayHello() {
        return restTemplate.getForEntity("http://compute-service/hello",String.class).getBody();

    }

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String add(Integer a,Integer b) {
        return  restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=" + a + "&b=" + b, String.class).getBody();
    }

    public String addServiceFallback() {
        return "error";
    }
}
