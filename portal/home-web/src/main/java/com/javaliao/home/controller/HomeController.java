package com.javaliao.home.controller;

import com.javaliao.home.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author lzw
 * @Description
 * @Date 11:45 2019/12/18
 * @ClassName HomeController
 * @Version 1.0
 **/
@Api(tags = "HomeController",description = "首页管理")
@Controller
public class HomeController {

    @Autowired
    HomeService homeService;

    @ApiOperation("去首页")
    @GetMapping("/")
    public String Jump(){
        homeService.getHomeInfo();
        return "index";
    }
}
