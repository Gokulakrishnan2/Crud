package com.crud.javaTamil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableJpaRepositories("com.crud.javaTamil.customerRepo")
@ComponentScan(basePackages = {"com.crud.javaTamil.controller","com.crud.javaTamil.service"})
@EntityScan("com.crud.javaTamil.Entity")
@EnableAutoConfiguration
public class JavaTamilApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTamilApplication.class, args);
	}

}
