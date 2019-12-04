package com.javaliao.backstage.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "DemoController",description = "演示")
@Controller
public class DemoController {

    @ApiOperation("去首页")
    @GetMapping("/")
    public String Jump(){
        return "main";
    }

    @ApiOperation("测试")
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
}
