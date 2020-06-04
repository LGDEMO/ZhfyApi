package com.zhfy.zhfyapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhfy.zhfyapi.mapper")//扫描的mapper
@SpringBootApplication
public class ZhfyapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhfyapiApplication.class, args);
    }

}
