package com.javaliao.backstage.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Api(tags = "JumpController",description = "跳转管理")
public class JumpController {

    @GetMapping("/jump")
    public String Jump(){
        return "main";
    }
}
