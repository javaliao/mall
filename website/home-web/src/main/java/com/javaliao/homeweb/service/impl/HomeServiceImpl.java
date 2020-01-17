package com.javaliao.homeweb.service.impl;

import com.javaliao.basic.common.CommonResult;
import com.javaliao.basic.model.TbAdvertisement;
import com.javaliao.basic.model.TbColumn;
import com.javaliao.basic.model.TbSpecialTopic;
import com.javaliao.basic.utils.ThreadTool;
import com.javaliao.basic.vo.ProductCategoryVo;
import com.javaliao.homeweb.feign.HomeFeign;
import com.javaliao.homeweb.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CountDownLatch;

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
    public ModelMap getHomeInfo(ModelMap modelMap) throws NoSuchMethodException, InterruptedException {
        //未做优化之前

//        //获取商品分类信息
//        List<ProductCategoryVo> productCategory = homeFeign.getProductCategory();
//        modelMap.addAttribute("productCategory",CommonResult.checkNull(productCategory));
//        //获取专题
//        List<TbSpecialTopic> specialTopics = homeFeign.getSpecialTopic();
//        modelMap.addAttribute("specialTopics",CommonResult.checkNull(specialTopics));
//        //获取栏目
//        List<TbColumn> columns = homeFeign.getColumn();
//        modelMap.addAttribute("columns",CommonResult.checkNull(columns));
//        //获取广告
//        List<TbAdvertisement> tbAdvertisements = homeFeign.getAdvertisement();
//        modelMap.addAttribute("advertisements",CommonResult.checkNull(tbAdvertisements));

        //使用线程池做优化后

        final CountDownLatch latch = new CountDownLatch(4);
        //获取商品分类
        Method getProductCategory = homeFeign.getClass().getMethod("getProductCategory");
        getProductCategory.setAccessible(Boolean.TRUE);
        ThreadTool.runMethod(latch,modelMap,"productCategory",homeFeign, getProductCategory,null);
        //
        Method getSpecialTopic = homeFeign.getClass().getMethod("getSpecialTopic");
        getSpecialTopic.setAccessible(Boolean.TRUE);
        ThreadTool.runMethod(latch,modelMap,"specialTopics",homeFeign, getSpecialTopic,null);

        Method getColumn = homeFeign.getClass().getMethod("getColumn");
        getColumn.setAccessible(Boolean.TRUE);
        ThreadTool.runMethod(latch,modelMap,"columns",homeFeign, getColumn,null);

        Method getAdvertisement = homeFeign.getClass().getMethod("getAdvertisement");
        getAdvertisement.setAccessible(Boolean.TRUE);
        ThreadTool.runMethod(latch,modelMap,"advertisements",homeFeign, getAdvertisement,null);

        latch.await();
        return modelMap;
    }
}
