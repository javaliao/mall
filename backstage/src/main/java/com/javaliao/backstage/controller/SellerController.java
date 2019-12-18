package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbSeller;
import com.javaliao.backstage.service.SellerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = "sellerController",description = "卖家管理")
@Controller
@RequestMapping("/sellerController")
public class SellerController extends BaseController{

    @Autowired
    SellerService sellerService;

    @ApiOperation("获取卖家列表")
    @GetMapping("/getSellerList")
    public String getSellerList(ModelMap modelMap) {
        sellerService.getSellerList(modelMap);
        return "seller/list";
    }

    @ApiOperation("卖家搜索")
    @PostMapping("/sellerSearch")
    public String sellerSearch(TbSeller tbSeller, ModelMap modelMap) {
        sellerService.sellerSearch(tbSeller, modelMap);
        return "seller/list";
    }

    @ApiOperation("根据卖家ID获取卖家信息")
    @GetMapping("/getSellerById")
    public String getSellerById(String sellerId, ModelMap modelMap) {
        sellerService.getSellerById(sellerId, modelMap);
        return "seller/modify";
    }

    @ApiOperation("删除卖家")
    @GetMapping("/removeSellerById")
    public String removeSellerById(String sellerId) throws Exception {
        sellerService.removeSellerById(sellerId);
        return "redirect:getSellerList";
    }

    @ApiOperation("更新卖家")
    @PostMapping("/updateSeller")
    public String updateSeller(TbSeller tbSeller) throws Exception {
        sellerService.updateSeller(tbSeller);
        return "redirect:getSellerList";
    }

    @ApiOperation("添加卖家")
    @PostMapping("/insertSeller")
    public String insertSeller(TbSeller tbSeller) throws Exception {
        sellerService.insertSeller(tbSeller);
        return "redirect:getSellerList";
    }
}
