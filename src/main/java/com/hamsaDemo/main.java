package com.hamsaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class main {
    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
    }
@GetMapping("/")
    public GreetResponse hello() {
    return new GreetResponse("This server is live", List.of("java", "JavaScript", "python"), new Person("Massan"));
}

    record Person(String name){}
    record GreetResponse(String greet, List<String> favprogName, Person person) {}

}


