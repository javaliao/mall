package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbAdvertisement;
import com.javaliao.backstage.service.AdvertisementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/advertisementController")
@Api(tags = "AdvertisementController", description = "广告管理")
public class AdvertisementController {
    @Autowired
    private AdvertisementService advertisementService;

    @ApiOperation("获取广告列表")
    @GetMapping("/getAdvertisementList")
    public String getAdvertisementList(ModelMap modelMap) {
        advertisementService.getAdvertisementList(modelMap);
        return "advertisement/list";
    }

    @ApiOperation("根据条件获取广告列表")
    @GetMapping("/advertisementSerach")
    public String advertisementSerach(TbAdvertisement advertisement, ModelMap modelMap) {
        advertisementService.advertisementSearch(advertisement, modelMap);
        return "advertisement/list";
    }

    @ApiOperation("/根据id获取广告信息")
    @GetMapping("getAdvertisementById")
    public String getAdvertisementById(String advertiseId, ModelMap modelMap) {
        advertisementService.getAdvertisementById(advertiseId, modelMap);
        return "advertisement/modify";
    }

    @ApiOperation("添加广告")
    @PostMapping("insertAdvertisement")
    public String insertAdvertisement(TbAdvertisement tbAdvertisement) throws Exception {
        advertisementService.insertAdvertisement(tbAdvertisement);
        return "advertisement/list";
    }

    @ApiOperation("更新广告")
    @PostMapping("updateAdvertisement")
    public String uopdateAdvertisement(TbAdvertisement tbAdvertisement) throws Exception {
        advertisementService.updateAdvertisement(tbAdvertisement);
        return "advertisement/list";
    }

    @ApiOperation("更新广告")
    @PostMapping("deleteAdvertisement")
    public String deleteAdvertisement(String advertisementId) throws Exception {
        advertisementService.removeAdvertisementById(advertisementId);
        return "advertisement/list";
    }
}
