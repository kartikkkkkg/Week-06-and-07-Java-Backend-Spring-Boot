package com.example.hello;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage() {
        return "Hello from Service via GET!";
    }

    public String postGreetingMessage(String message) {
        return "POST Received from Service: " + message;
    }

    public String putGreetingMessage(String message) {
        return "PUT Updated from Service: " + message;
    }

    public String deleteGreetingMessage() {
        return "Greeting deleted via Service!";
    }
}
