package com.ritchie.james;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Magic8BallAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(Magic8BallAPIApplication.class, args);
    }
}
