package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        System.out.println("更新版本2");
        System.out.println("更新版本3");
        System.out.println("更新版本4 dev");
        System.out.println("更新版本5 dev");
    }

}
