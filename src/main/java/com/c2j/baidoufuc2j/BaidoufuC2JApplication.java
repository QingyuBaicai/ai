package com.c2j.baidoufuc2j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class BaidoufuC2JApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaidoufuC2JApplication.class, args);
    }

}
