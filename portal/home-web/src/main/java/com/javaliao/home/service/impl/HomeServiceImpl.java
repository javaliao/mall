package com.javaliao.home.service.impl;

import com.javaliao.home.feign.HomeServiceFeign;
import com.javaliao.home.service.HomeService;
import common.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author lzw
 * @Description
 * @Date 13:02 2019/12/18
 * @ClassName HomeServiceImpl
 * @Version 1.0
 **/
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    HomeServiceFeign homeServiceFeign;
    
    /**
     * @Description :获取首页信息
     * @Author :USE
     * @Date :13:06 2019/12/18
     * @ClassName :HomeServiceImpl
     * @MethodName :getHomeInfo
     * @param
     * @return :void
     **/
    @Override
    public void getHomeInfo() {
        //获取商品分类信息
        CommonResult commonResult = homeServiceFeign.getProductCategory();
        System.out.println(commonResult);

    }
}
