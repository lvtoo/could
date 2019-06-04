package com.oouul.calculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class CalculateApplication {


    public static void main(String[] args) {
        SpringApplication.run(CalculateApplication.class, args);
    }

}
