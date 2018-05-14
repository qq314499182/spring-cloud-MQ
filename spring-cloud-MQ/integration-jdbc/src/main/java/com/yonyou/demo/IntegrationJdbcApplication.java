package com.yonyou.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:jdbc-inbound-context.xml")
public class IntegrationJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationJdbcApplication.class, args);
	}
}
