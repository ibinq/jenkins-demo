package com.bing.jenkinsdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController()
public class JenkinsDemoApplication {

    @Value("${zhoubing.name}")
    private String name;

    @Value("${zhoubing.age}")
    private Integer age;

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

    @GetMapping("hi")
    public String hi(){
        return  (name+"--"+age);
    }
}
