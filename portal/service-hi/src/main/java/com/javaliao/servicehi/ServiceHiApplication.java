package com.javaliao.servicehi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 通过注解@EnableEurekaClient 表明自己是一个eurekaclient.
 * 通过注解@RestController 返回json类型的数据
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

}
