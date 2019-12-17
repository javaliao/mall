package com.javaliao.backstage.service;

import com.javaliao.backstage.bean.TbCoupon;
import org.springframework.ui.ModelMap;

public interface CouponService {

    void getCouponList(ModelMap modelMap);

    void couponSerach(TbCoupon coupon, ModelMap modelMap);

    void getCouponById(String couponId, ModelMap modelMap);

    void insertCoupon(TbCoupon Coupon) throws Exception;

    void updateCoupon(TbCoupon coupon) throws Exception;

    void removeCoupon(String couponId) throws Exception;
}
