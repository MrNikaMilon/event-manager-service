package com.nikamilon.eventappcore;

import org.springframework.boot.SpringApplication;

public class TestEventAppCoreApplication {

    public static void main(String[] args) {
        SpringApplication.from(EventAppCoreApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
