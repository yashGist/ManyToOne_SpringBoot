package com.manytoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.mto", "com.manytoone"})
@EnableJpaRepositories(basePackages = {"com.mto.repository"})
@EntityScan(basePackages = {"com.mto.entity"})
public class ManyToOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManyToOneApplication.class, args);
    }

}
