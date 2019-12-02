package com.javaliao.backstage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * MyBatis配置类
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.javaliao.backstage.mapper"})//继承tk通用mapper
public class MyBatisConfig {

}
