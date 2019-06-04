package com.oouul.ribbon.controller;

import com.oouul.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private HelloService helloService;


    @GetMapping("/add")
    public String add(){
        return helloService.sayHello();
    }
}
