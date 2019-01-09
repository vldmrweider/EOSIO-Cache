package com.pugachev.emr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@ComponentScan({"com.pugachev.emr.service","com.pugachev.emr.repository"})
@EnableMongoRepositories("com.pugachev.emr.repository")
public class EmrApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EmrApplication.class, args);
    }

}

