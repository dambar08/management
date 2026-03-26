package com.open.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ })
public class ManagementApplication {

	private static final Logger LOG = LoggerFactory.getLogger(ManagementApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

}
