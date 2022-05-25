package com.keshar.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.keshar.*"})
@EntityScan(basePackages = {"com.keshar.*"})
@EnableJpaRepositories(basePackages = {"com.keshar.*"})
public class HMSApplication {
    /**
     * @project multimodule-project
     * @author kesharpaudel on 18/05/2022
     * @created_at 18(Wed) May,2022 at 4:06 PM
     */

    public static void main(String[] args) {
        SpringApplication.run(HMSApplication.class);
    }

}
