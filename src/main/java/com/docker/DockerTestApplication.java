package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerTestApplication {

    @RequestMapping("/")
    public String home() {
        return "hello docker!!!";
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerTestApplication.class, args);
    }

}
