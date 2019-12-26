package com.javaliao.homeservice.controller;

import com.javaliao.basic.common.CommonResult;
import com.javaliao.basic.mapper.TbProductCategoryMapper;
import com.javaliao.basic.model.TbProductCategory;
import com.javaliao.basic.model.TbProductCategoryExample;
import com.javaliao.basic.utils.BeanClone;
import com.javaliao.basic.utils.CollectionTool;
import com.javaliao.homeservice.service.ProductSerivce;
import com.javaliao.homeservice.vo.ProductCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author lzw
 * @Description
 * @Date 11:02 2019/12/26
 * @ClassName ProductController
 * @Version 1.0
 **/
@RestController
@RequestMapping("/productController")
public class ProductController {

    @Autowired
    ProductSerivce productSerivce;

    @RequestMapping(value = "/getProductCategory",method = RequestMethod.GET)
    public CommonResult getProductCategory(){
        List<ProductCategoryVo> productCategory = productSerivce.getProductCategory();
        return CommonResult.success(CommonResult.checkNull(productCategory));
    }
}
