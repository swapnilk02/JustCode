/**
 * _____________________________*
 * Copyright (C) 2022, JustCode *
 * All rights reserved.			*
 * _____________________________*
 */

package com.example.SpringBootMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBootMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoDbApplication.class, args);
    }

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.example.SpringBootMongoDB")).build();
    }
}
