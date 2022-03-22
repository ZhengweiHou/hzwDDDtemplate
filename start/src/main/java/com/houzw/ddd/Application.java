package com.houzw.ddd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Spring Boot Starter
 *
 * @author houzw
 */
@SpringBootApplication(scanBasePackages = {"com.houzw.ddd"})
@MapperScan("com.houzw.ddd.gateway.database.mapper")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
