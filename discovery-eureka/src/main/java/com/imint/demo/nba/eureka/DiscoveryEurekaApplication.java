package com.imint.demo.nba.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Eureka Server
 * <p>Desc</p>
 * @author: idong
 * @date: May 12, 2016 10:23:44 AM
 * @version: V1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryEurekaApplication.class, args);
	}
}
