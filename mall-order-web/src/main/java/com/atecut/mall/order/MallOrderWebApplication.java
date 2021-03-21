package com.atecut.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MallOrderWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallOrderWebApplication.class, args);
    }

}
