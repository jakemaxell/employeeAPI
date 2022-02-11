package com.jakemaxell.userdatabaseapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jakemaxell.userdatabaseapi.domain.Employee;
import com.jakemaxell.userdatabaseapi.repository.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
@EnableSwagger2
public class UserDatabaseApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserDatabaseApiApplication.class, args);
        System.out.println("THE SERVER IS RUNNING...");
    }

}

