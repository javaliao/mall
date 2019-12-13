package com.javaliao.serviceribbon.controller;

import com.javaliao.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/21 10:32
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }


}