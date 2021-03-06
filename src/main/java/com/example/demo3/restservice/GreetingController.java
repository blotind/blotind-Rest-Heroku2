package com.example.demo3.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/greetings")
    public String greeting() {
        return "So many Greetings";
    }

    @GetMapping("/jungle")
    public String jungle() {
        return "Jungle Balls";
    }

    @GetMapping("/Stillactive")
    public String stillUp() {
        return "Still up";
    }
}
