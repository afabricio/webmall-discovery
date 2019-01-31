package com.webmall.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WebmallDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebmallDiscoveryApplication.class, args);
	}

}

