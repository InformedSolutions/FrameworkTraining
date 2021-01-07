package com.informed.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@SpringBootApplication
@ComponentScan(basePackages = {"com.informed.booking", "com.informed.service"})
@EntityScan("com.informed.booking")
@EnableJpaRepositories("com.informed.booking.repositories")
public class BookingSystemService {

    public static void main(String[] args) throws SQLException {
        System.out.println("Starting Booking System Service");
        ConfigurableApplicationContext context = SpringApplication.run(BookingSystemService.class, args);
        System.out.println("Setup finished");

    }
}