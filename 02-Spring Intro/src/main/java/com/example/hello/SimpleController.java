package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/simple-hello")
    public String sayHello() {
        return "Hello from Simple Controller!";
    }
}
