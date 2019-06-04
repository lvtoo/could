package com.oouul.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ComputeClient computeClient;

    @GetMapping("/add")
    public Integer add(){
        return  computeClient.add(10,20);
    }
}
