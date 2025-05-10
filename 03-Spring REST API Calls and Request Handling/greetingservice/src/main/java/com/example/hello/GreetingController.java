package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public Greeting getGreeting() {
        return new Greeting(greetingService.getGreetingMessage());
    }

    @PostMapping
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return new Greeting(greetingService.postGreetingMessage(greeting.getMessage()));
    }

    @PutMapping
    public Greeting putGreeting(@RequestBody Greeting greeting) {
        return new Greeting(greetingService.putGreetingMessage(greeting.getMessage()));
    }

    @DeleteMapping
    public Greeting deleteGreeting() {
        return new Greeting(greetingService.deleteGreetingMessage());
    }
}
