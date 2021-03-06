package com.jxy.graduation_pro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jxy.graduation_pro.mapper")
public class GraduationProApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduationProApplication.class, args);
    }

}
