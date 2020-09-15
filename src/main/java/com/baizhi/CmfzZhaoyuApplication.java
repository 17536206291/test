package com.baizhi;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class CmfzZhaoyuApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmfzZhaoyuApplication.class, args);
    }

}

