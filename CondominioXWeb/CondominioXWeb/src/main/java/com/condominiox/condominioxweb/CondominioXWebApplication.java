package com.condominiox.condominioxweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.condominiox")
@ComponentScan(basePackages = {"com.condominiox.controller", "com.condominiox.condominioxweb"})
public class CondominioXWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(CondominioXWebApplication.class, args);
    }
}