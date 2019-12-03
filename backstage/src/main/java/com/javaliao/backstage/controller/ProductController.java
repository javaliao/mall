package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbProduct;
import com.javaliao.backstage.mapper.ProductMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
@Api(tags = "ProductController",description = "商品管理")
public class ProductController extends BaseController{

    @Autowired
    ProductMapper productMapper;

    @ApiOperation("获取商品列表")
    @GetMapping("/getProductList")
    public String getProductList(ModelMap modelMap) throws Exception {
        List<TbProduct> tbProducts = productMapper.selectAll();
        modelMap.addAttribute("tbProducts",tbProducts);
        return "product/list";
    }

    @ApiOperation("根据商品ID获取商品信息")
    @GetMapping("/toModifyById")
    public String toModifyById(String productId, ModelMap modelMap){
        TbProduct tbProduct = new TbProduct();
        tbProduct.setId(productId);
        TbProduct tbProductData = productMapper.selectOne(tbProduct);
        modelMap.addAttribute("tbProduct",tbProductData);
        return "product/modify";
    }

    @ApiOperation("添加商品")
    @PostMapping("/insertProduct")
    public String insertProduct(TbProduct tbProduct) throws Exception {
        int insert = productMapper.insert(tbProduct);
        if(insert <= 0){
            throw new Exception("添加失败！");
        }
        return "product/list";
    }

    @ApiOperation("更新商品")
    @PostMapping("/updateProduct")
    public String updateProduct(TbProduct tbProduct) throws Exception {
        int i = productMapper.updateByPrimaryKey(tbProduct);
        if(i <= 0){
            throw new Exception("更新失败！");
        }
        return "redirect:getProductList";
    }

    @ApiOperation("删除商品")
    @GetMapping("/removeProduct")
    public String removeProduct(String productId) throws Exception {
        TbProduct tbProduct = new TbProduct();
        tbProduct.setId(productId);
        int delete = productMapper.delete(tbProduct);
        if(delete <= 0){
            throw new Exception("删除失败！");
        }
        return "redirect:getProductList";
    }

}
