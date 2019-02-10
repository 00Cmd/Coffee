package com.caffeine.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
@ComponentScan({"com.caffeine.coffee"})
@EnableJpaRepositories({"com.caffeine.coffee.repository"})
@EntityScan({"com.caffeine.coffee.pojo"})
public class CoffeeApplication {

    public static void main(String[] args) {

        SpringApplication.run(CoffeeApplication.class, args);
    }


}

