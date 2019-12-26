package com.javaliao.feign.controller;

import com.javaliao.feign.feignInterface.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/21 11:30
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    /**
     * 在Web层的controller层，对外暴露一个”/hi”的API接口，通过上面定义的Feign客户端SchedualServiceHi 来消费服务。
     * @param name
     * @return
     */
    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHi(name);
    }
}

