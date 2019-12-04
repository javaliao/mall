package com.javaliao.backstage.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @ApiOperation("去首页")
    @GetMapping("/")
    public String Jump(){
        return "main";
    }
}
