package com.javaliao.homeweb.controller;

import com.javaliao.homeweb.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author lzw
 * @Description
 * @Date 16:49 2019/12/24
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
    public String Jump(ModelMap modelMap) throws NoSuchMethodException, InterruptedException {
        homeService.getHomeInfo(modelMap);
        return "index";
    }
}