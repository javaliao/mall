package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbCoupon;
import com.javaliao.backstage.service.CouponService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/couponController")
@Api(tags = "CouponController", description = "优惠券管理")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @ApiOperation("获取优惠券列表")
    @GetMapping("getCouponList")
    public String getCouponList(ModelMap modelMap){
        couponService.getCouponList(modelMap);
        return "coupon/list";
    }
    @ApiOperation("根据搜索条件获取优惠券列表")
    @GetMapping("couponSerach")
    public String couponSerach(TbCoupon coupon,ModelMap modelMap){
        couponService.couponSerach(coupon,modelMap);
        return "coupon/list";
    }
    @ApiOperation("根据id获取优惠券")
    @GetMapping("getCouponById")
    public String getCouponById(String couponId,ModelMap modelMap){
        couponService.getCouponById(couponId,modelMap);
        return "coupon/modify";
    }

    @ApiOperation("添加优惠券")
    @PostMapping("insertCoupon")
    public String insertCoupon(TbCoupon coupon) throws Exception{
        couponService.insertCoupon(coupon);
        return "coupon/list";
    }
    @ApiOperation("更新优惠券")
    @PostMapping("updateCoupon")
    public String updateCoupon(TbCoupon coupon) throws Exception{
        couponService.updateCoupon(coupon);
        return "coupon/list";
    }
    @ApiOperation("删除优惠券")
    @PostMapping("removeCoupon")
    public String removeCoupon(String couponId) throws Exception{
        couponService.removeCoupon(couponId);
        return "coupon/list";
    }
}
