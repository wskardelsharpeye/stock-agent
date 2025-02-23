package com.stockai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.stockai")
@EntityScan("com.stockai.domain.model")
@EnableJpaRepositories("com.stockai.infrastructure.persistence.repository")
public class StockMarketAiApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockMarketAiApplication.class, args);
    }
} 