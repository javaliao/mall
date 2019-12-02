package com.javaliao.backstage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class BackstageApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BackstageApplication.class, args);
    }

    /**
     * 为了打包springboot项目，启动类当中加上extends SpringBootServletInitializer并重写configure方法
     * 部署项目（执行方式windows和linux上都一样）：到这个jar的根目录下执行java -jar backstage-0.0.1-SNAPSHOT.jar
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

}
