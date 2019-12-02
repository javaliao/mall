package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbProduct;
import com.javaliao.backstage.mapper.ProductMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
@Api(tags = "ProductController",description = "商品管理")
public class ProductController {

    @Autowired
    ProductMapper productMapper;

    @GetMapping("/getProductList")
    public String getProductList(ModelMap modelMap){
        List<TbProduct> tbProducts = productMapper.selectAll();
        modelMap.addAttribute("tbProducts",tbProducts);
        return "product/list";
    }

    @RequestMapping("/insertProduct")
    public String insertProduct(TbProduct tbProduct) throws Exception {
        int insert = productMapper.insert(tbProduct);
        if(insert < 0){
            throw new Exception("添加失败！");
        }
        return "product/list";
    }
}
