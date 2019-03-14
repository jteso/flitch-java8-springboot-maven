package com.example.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFlitchController {
    @RequestMapping("/")
    public String hello() {
        return "Greetings from Spring Boot running on Flitch!";
    }
}