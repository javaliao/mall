package com.javaliao.homeweb.service.impl;

import com.javaliao.basic.common.CommonResult;
import com.javaliao.basic.vo.ProductCategoryVo;
import com.javaliao.homeweb.feign.HomeFeign;
import com.javaliao.homeweb.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author lzw
 * @Description
 * @Date 16:52 2019/12/24
 * @ClassName HomeServiceImpl
 * @Version 1.0
 **/
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    HomeFeign homeFeign;

    @Override
    public String getHomeInfo() {
        //获取商品分类信息
        List<ProductCategoryVo> productCategory = homeFeign.getProductCategory();
        Object checkNull = CommonResult.checkNull(productCategory);
        //获取专题

        //获取栏目

        //获取广告

        return null;
    }
}
