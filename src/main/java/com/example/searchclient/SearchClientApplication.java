package com.example.searchclient;

import lombok.Generated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Generated
@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
public class SearchClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchClientApplication.class, args);
    }

}
