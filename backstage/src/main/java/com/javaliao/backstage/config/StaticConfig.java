package com.javaliao.backstage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 继承WebMvcConfigurationSupport 会导致WebMvcAutoConfiguration不加载，所以默认配置丢失导致静态资源等无法访问
 * 重写addResourceHandlers方法恢复静态资源访问
 */
@Configuration
public class StaticConfig extends WebMvcConfigurationSupport {


    //添加此方法恢复静态资源访问
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/public/");
    }


}

