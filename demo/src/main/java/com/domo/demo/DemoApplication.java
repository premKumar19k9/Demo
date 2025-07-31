package com.domo.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		log.info("Starting Application");
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		log.info("Application Context: {}", applicationContext.getId());
		log.info("Started Application {}", applicationContext.getEnvironment().getProperty("spring.application.name"));
	}

}
