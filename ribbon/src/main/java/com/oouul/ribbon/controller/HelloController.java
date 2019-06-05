package com.oouul.ribbon.controller;

import com.oouul.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return helloService.sayHello();

    }

    @GetMapping("/add")
    public String add(@RequestParam Integer a, @RequestParam Integer b){
        return helloService.add(a,b);
    }
}
