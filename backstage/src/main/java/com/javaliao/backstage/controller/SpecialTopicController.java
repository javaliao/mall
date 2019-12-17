package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbSpecialTopic;
import com.javaliao.backstage.service.SpecialTopicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/specialTopicController")
@Api(tags = "SpecialTopicController", description = "专题管理")
public class SpecialTopicController {
    @Autowired
    private SpecialTopicService specialTopicService;

    @ApiOperation("获取专题列表")
    @GetMapping("getSpecialTopicList")
    public String getSpecialTopicList(ModelMap modelMap){
        specialTopicService.getSpecialTopicList(modelMap);
        return "specialtopic/list";
    }
    @ApiOperation("根据搜索条件获取专题列表")
    @GetMapping("specialTopicSerach")
    public String specialTopicSerach(TbSpecialTopic tbSpecialTopic, ModelMap modelMap){
        specialTopicService.SpecialTopicSerach(tbSpecialTopic,modelMap);
        return "specialtopic/list";
    }
    @ApiOperation("根据id获取专题")
    @GetMapping("getSpecialTopicById")
    public String getSpecialTopicById(String specialTopicId,ModelMap modelMap){
        specialTopicService.getSpecialTopicById(specialTopicId,modelMap);
        return "specialtopic/modify";
    }

    @ApiOperation("添加专题")
    @PostMapping("insertSpecialTopic")
    public String insertSpecialTopic(TbSpecialTopic tbSpecialTopic) throws Exception{
        specialTopicService.insertSpecialTopic(tbSpecialTopic);
        return "specialtopic/list";
    }
    @ApiOperation("更新专题")
    @PostMapping("updateSpecialTopic")
    public String updateSpecialTopic(TbSpecialTopic tbSpecialTopic) throws Exception{
        specialTopicService.updateSpecialTopic(tbSpecialTopic);
        return "specialtopic/list";
    }
    @ApiOperation("删除专题")
    @PostMapping("removeSpecialTopic")
    public String removeSpecialTopic(String specialTopicId) throws Exception{
        specialTopicService.removeSpecialTopic(specialTopicId);
        return "specialtopic/list";
    }
}
