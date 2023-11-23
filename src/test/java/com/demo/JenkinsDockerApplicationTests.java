package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDockerApplicationTests {
    Logger logger = LoggerFactory.getLogger(JenkinsDockerApplication.class);

    @Test
    void contextLoads() {
        logger.info("Jenkins Docker Application Tests executed...................");
        Assertions.assertEquals(true, true);
    }

}
