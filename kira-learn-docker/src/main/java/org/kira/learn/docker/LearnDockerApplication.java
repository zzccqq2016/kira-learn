package org.kira.learn.docker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/11/2 17:15
 */
@SpringBootApplication
public class LearnDockerApplication implements ApplicationRunner {

    @Value("${redis.addrs:default}")
    private String value;

    public static void main(String[] args) {
        SpringApplication.run(LearnDockerApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("----------------------------------" + value);
    }
}