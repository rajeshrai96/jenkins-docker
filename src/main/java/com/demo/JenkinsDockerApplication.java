package com.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDockerApplication {
    Logger logger = LoggerFactory.getLogger(JenkinsDockerApplication.class);

    @PostConstruct
    public void intt() {
        logger.info("Jenkins Docker Application started.......................");
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDockerApplication.class, args);
    }

}
