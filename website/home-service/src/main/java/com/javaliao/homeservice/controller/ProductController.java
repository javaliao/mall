package com.javaliao.homeservice.controller;

import com.javaliao.homeservice.service.ProductSerivce;
import com.javaliao.basic.vo.ProductCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @Author lzw
 * @Description 商品管理
 * @Date 11:02 2019/12/26
 * @ClassName ProductController
 * @Version 1.0
 **/
@RestController
@RequestMapping("/productController")
public class ProductController {

    @Autowired
    ProductSerivce productSerivce;

    @GetMapping("/getProductCategory")
    public List<ProductCategoryVo> getProductCategory(){
        List<ProductCategoryVo> productCategory = productSerivce.getProductCategory();
        return productCategory;
    }
}
