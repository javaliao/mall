package com.javaliao.backstage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class BackstageApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BackstageApplication.class, args);
    }

    /**
     * 为了打包springboot项目，启动类当中加上extends SpringBootServletInitializer并重写configure方法
     * 部署项目（执行方式windows和linux上都一样）：到这个jar的根目录下执行java -jar backstage-0.0.1-SNAPSHOT.jar

     在绝对路径下直接启动该服务，如cd /usr/local/apache-tomcat/bin/
     ，下面是对应的启动脚本，直接 ./catalina.sh  启动。
     * http://139.224.137.74:8080
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

}
