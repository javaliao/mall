package com.javaliao.feign.feignInterface;

import com.javaliao.feign.component.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/21 11:29
 * 在FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类就行了
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    /**
     * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
     * 在代码中调用了service-hi服务的“/hi”接口
     * // 两个坑：1. @GetMapping不支持   2. @PathVariable和@RequestParam得设置value
     * @param name
     * @return
     */
    @RequestMapping(value = "/userController/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name") String name);
}
