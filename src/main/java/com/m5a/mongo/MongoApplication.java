package com.m5a.mongo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "INTERFAZ SWAGGER",
                version = "1.0.0",
                description = "PROYECTO REALIZADO POR ALEJANDRO CORASPE",
                termsOfService = "M5A",
                contact = @Contact(
                        name = "Instituto Superior Tecnologico Del Azuay",
                        email = "info@tecazuay.edu.ec"
                )
        )
)
public class MongoApplication {


    public static void main(String[] args) {
        SpringApplication.run(MongoApplication.class, args);
    }

}
