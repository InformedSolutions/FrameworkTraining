package com.informed.FamilyTree.main;

import com.informed.FamilyTree.controller.FamilyTreeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.SQLException;


@SpringBootApplication
@ComponentScan(basePackages = {"com.informed.FamilyTree"})
@EntityScan("com.informed.FamilyTree.domain")
@EnableJpaRepositories("com.informed.FamilyTree")

public class FamilyTreeService {
    public static void main(String[] args) throws SQLException {
        System.out.println("Starting FamilyTree setup");
        ConfigurableApplicationContext context = SpringApplication.run(FamilyTreeService.class, args);
        System.out.println("Setup finished");
    }
}
