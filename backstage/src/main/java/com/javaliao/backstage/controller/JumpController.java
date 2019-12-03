package com.javaliao.backstage.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jumpController")
@Api(tags = "JumpController",description = "跳转管理")
public class JumpController {

    @ApiOperation("去首页")
    @GetMapping("/")
    public String Jump(){
        return "main";
    }

    @ApiOperation("异常页")
    @GetMapping("/toError")
    public String toError(String message,ModelMap modelMap){
        modelMap.addAttribute("ex",message);
        return "error/exceptionCatch";
    }

    @ApiOperation("去商品修改页")
    @GetMapping("/toProductModify")
    public String toProductModify(){
        return "product/modify";
    }

    @ApiOperation("去商品分类修改页")
    @GetMapping("/toProductCategoryModify")
    public String toProductCategoryModify(){
        return "productCategory/modify";
    }

}
