package com.javaliao.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import zipkin.server.EnableZipkinServer;

/**
 * 在其入口applicaton类加上注解@EnableZuulProxy，开启zuul的功能
 * 在程序的启动类ZipkinServiceApplication加上@EnableZipkinServer开启ZipkinServer的功能，
 * 加上@EnableEurekaClient注解，启动Eureka Client。
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableZipkinServer
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

}
