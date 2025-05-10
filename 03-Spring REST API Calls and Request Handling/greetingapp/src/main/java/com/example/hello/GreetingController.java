package com.example.hello;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public Greeting getGreeting() {
        return new Greeting("Hello from GET!");
    }

    @PostMapping
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return new Greeting("POST Received: " + greeting.getMessage());
    }

    @PutMapping
    public Greeting putGreeting(@RequestBody Greeting greeting) {
        return new Greeting("PUT Updated: " + greeting.getMessage());
    }

    @DeleteMapping
    public Greeting deleteGreeting() {
        return new Greeting("Greeting deleted successfully!");
    }
}
