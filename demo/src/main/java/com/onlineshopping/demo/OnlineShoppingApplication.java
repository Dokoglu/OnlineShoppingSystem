package com.onlineshopping.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.onlineshopping.demo.repository"})
@SpringBootApplication(scanBasePackages = {"com.onlineshopping.demo.service", "com"})
@ComponentScan(basePackages = {"com.onlineshopping.demo.service"})
@EntityScan("com.onlineshopping.demo.entities")
public class OnlineShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingApplication.class, args);
		


}
}