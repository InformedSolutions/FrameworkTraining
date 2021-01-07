package com.informed.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@SpringBootApplication
@ComponentScan(basePackages = {"com.informed.booking", "com.informed.service"})
public class BookingSystemService {

    public static void main(String[] args) throws SQLException {
        System.out.println("Starting Booking System Service");
        ConfigurableApplicationContext context = SpringApplication.run(BookingSystemService.class, args);
        System.out.println("Setup finished");

    }
}