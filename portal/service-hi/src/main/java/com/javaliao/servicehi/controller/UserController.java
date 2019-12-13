package com.javaliao.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/23 13:35
 */
@RestController
@RequestMapping("/userController")
public class UserController {


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name") String name){
        return "name:"+name;
    }
}
