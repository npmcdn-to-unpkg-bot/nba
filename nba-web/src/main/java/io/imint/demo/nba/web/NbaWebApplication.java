package io.imint.demo.nba.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class NbaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbaWebApplication.class, args);
    }
}
