package com.dennis.hypermarket.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HypermarketGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HypermarketGatewayApplication.class, args);
    }

}
