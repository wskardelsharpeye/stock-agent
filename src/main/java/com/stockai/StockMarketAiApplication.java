package com.stockai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StockMarketAiApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockMarketAiApplication.class, args);
    }
} 