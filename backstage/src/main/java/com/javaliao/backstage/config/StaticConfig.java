package com.javaliao.backstage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 继承WebMvcConfigurationSupport 会导致WebMvcAutoConfiguration不加载，所以默认配置丢失导致静态资源等无法访问
 * 重写addResourceHandlers方法恢复静态资源访问
 * spring2.x继承WebMvcConfigurationSupport 如果是spring1.X,继承WebMvcConfigurerAdapter
 */
@Configuration
public class StaticConfig extends WebMvcConfigurationSupport {


    //添加此方法恢复静态资源访问
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有/static/** 访问都映射到classpath:/static/ 目录下
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/public/");
        //swagger2 最主要就是这两句
        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        super.addResourceHandlers(registry);
    }


}

