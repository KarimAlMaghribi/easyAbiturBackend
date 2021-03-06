package de.rakia.easyAbiturService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = {"de.rakia.easyAbiturService.model"})
@SpringBootApplication
public class EasyAbiturServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyAbiturServiceApplication.class, args);
	}

}
