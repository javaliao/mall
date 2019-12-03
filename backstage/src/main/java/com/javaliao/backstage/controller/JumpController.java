package com.javaliao.backstage.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Api(tags = "JumpController",description = "跳转管理")
public class JumpController {

    @GetMapping("/")
    public String Jump(){
        return "main";
    }

    @GetMapping("/toModify")
    public String toModify(){
        return "product/modify";
    }

}
