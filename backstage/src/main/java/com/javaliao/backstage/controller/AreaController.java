package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbArea;
import com.javaliao.backstage.service.AreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/areaController")
@Api(tags = "AreaController", description = "地区管理")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @ApiOperation("获取地区列表")
    @GetMapping("/getAreaList")
    public String getAreaList(ModelMap modelMap) {
        areaService.getAreaList(modelMap);
        return "area/list";
    }

    @ApiOperation("根据搜索条件获取地区列表")
    @GetMapping("/areaSerach")
    public String areaSerach(TbArea tbArea, ModelMap modelMap) {
        areaService.areaSerach(tbArea, modelMap);
        return "area/list";
    }

    @ApiOperation("根据id获取地区")
    @GetMapping("/getAreaById")
    public String getAreaById(String areaId, ModelMap modelMap) {
        areaService.getAreaById(areaId, modelMap);
        return "area/modify";
    }

    @ApiOperation("添加地区数据")
    @PostMapping("insertArea")
    public String insertArea(TbArea tbArea) throws Exception {
        areaService.insertArea(tbArea);
        return "area/list";
    }

    @ApiOperation("更新地区数据")
    @PostMapping("updateArea")
    public String updateArea(TbArea tbArea) throws Exception {
        areaService.updateArea(tbArea);
        return "area/list";
    }

    @ApiOperation("删除地区数据")
    @PostMapping("deleteArea")
    public String deleteArea(String areaId) throws Exception {
        areaService.removeArea(areaId);
        return "area/list";
    }
}
