package com.nh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * com.nh.web
 * create by admin nihui
 * create time 2020/12/4
 * version 1.0
 **/
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
    }
}
