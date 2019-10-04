package com.kelisehealth.sayconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SayConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SayConfigServiceApplication.class, args);
	}

}
