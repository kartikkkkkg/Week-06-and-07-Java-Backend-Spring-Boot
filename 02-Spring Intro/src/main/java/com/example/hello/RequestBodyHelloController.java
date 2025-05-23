package com.example.hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyHelloController {

    @PostMapping("/body-hello")
    public String sayHello(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}
