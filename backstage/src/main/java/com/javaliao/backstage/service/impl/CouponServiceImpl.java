package com.javaliao.backstage.service.impl;

import cn.hutool.core.util.StrUtil;
import com.javaliao.backstage.bean.TbCoupon;
import com.javaliao.backstage.mapper.CouponMapper;
import com.javaliao.backstage.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Date;
import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponMapper couponMapper;

    @Override
    public void getCouponList(ModelMap modelMap) {
        List<TbCoupon> tbCoupons = couponMapper.selectAll();
        modelMap.put("tbCoupons", tbCoupons);
    }

    @Override
    public void couponSerach(TbCoupon coupon, ModelMap modelMap) {
        coupon.setIsDelete(0L);
        if (StrUtil.isBlank(coupon.getCouponName())) {
            coupon.setCouponName(null);
        }
        List<TbCoupon> tbCoupons = couponMapper.select(coupon);
        modelMap.put("tbCoupons", tbCoupons);
    }

    @Override
    public void getCouponById(String couponId, ModelMap modelMap) {
        TbCoupon tbCoupon = couponMapper.selectByPrimaryKey(couponId);
        modelMap.put("tbCoupon", tbCoupon);
    }

    @Override
    public void insertCoupon(TbCoupon coupon) throws Exception {
        coupon.setIsDelete(0L);
        coupon.setCreateTime(new Date());
        coupon.setUpdateTime(coupon.getCreateTime());
        coupon.setCouponUseCount("0");
        coupon.setCouponReceiveCount("0");
        int flag = couponMapper.insertSelective(coupon);
        if (flag < 0) {
            throw new Exception("添加失败");
        }
    }

    @Override
    public void updateCoupon(TbCoupon coupon) throws Exception {
        coupon.setUpdateTime(new Date());
        int flag = couponMapper.updateByPrimaryKeySelective(coupon);
        if (flag < 0) {
            throw new Exception("更新失败");
        }
    }

    @Override
    public void removeCoupon(String couponId) throws Exception {
        TbCoupon coupon = couponMapper.selectByPrimaryKey(couponId);
        coupon.setIsDelete(1L);
        coupon.setUpdateTime(new Date());
        int flag = couponMapper.updateByPrimaryKeySelective(coupon);
        if (flag < 0) {
            throw new Exception("删除失败");
        }

    }
}
