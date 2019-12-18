package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbUser;
import com.javaliao.backstage.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = "userController",description = "用户管理")
@Controller
@RequestMapping("/userController")
public class UserController extends BaseController{

    @Autowired
    UserService userService;

    @ApiOperation("获取卖家列表")
    @GetMapping("/getUserList")
    public String getUserList(ModelMap modelMap) {
        userService.getUserList(modelMap);
        return "user/list";
    }

    @ApiOperation("用户搜索")
    @PostMapping("/userSearch")
    public String userSearch(TbUser tbUser, ModelMap modelMap) {
        userService.userSearch(tbUser, modelMap);
        return "user/list";
    }

    @ApiOperation("根据用户ID获取用户信息")
    @GetMapping("/getUserById")
    public String getUserById(String userId, ModelMap modelMap) {
        userService.getUserById(userId, modelMap);
        return "user/modify";
    }

    @ApiOperation("删除用户")
    @GetMapping("/removeUserById")
    public String removeUserById(String userId) throws Exception {
        userService.removeUserById(userId);
        return "redirect:getUserList";
    }

    @ApiOperation("更新用户")
    @PostMapping("/updateUser")
    public String updateUser(TbUser tbUser) throws Exception {
        userService.updateUser(tbUser);
        return "redirect:getUserList";
    }

    @ApiOperation("添加用户")
    @PostMapping("/insertUser")
    public String insertUser(TbUser tbUser) throws Exception {
        userService.insertUser(tbUser);
        return "redirect:getUserList";
    }
}
