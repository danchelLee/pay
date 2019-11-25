package com.danchel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: Dc Lee
 * @Description:
 * @Date: 15:08 2019/11/25
 */
@SpringBootApplication
public class PayApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PayApplication.class);
    }
}
