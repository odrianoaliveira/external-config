package com.goeuro.externalconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class ExternalConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalConfigApplication.class, args);
	}
}
