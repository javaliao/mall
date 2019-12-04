package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbProduct;
import com.javaliao.backstage.bean.TbProductCategory;
import com.javaliao.backstage.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productController")
@Api(tags = "ProductController",description = "商品管理")
public class ProductController extends BaseController{

    @Autowired
    ProductService productService;


    @ApiOperation("获取商品列表")
    @GetMapping("/getProductList")
    public String getProductList(ModelMap modelMap){
        productService.getProductList(modelMap);
        return "product/list";
    }

    @ApiOperation("商品搜索")
    @PostMapping("/productSearch")
    public String productSearch(TbProduct tbProduct,ModelMap modelMap){
        productService.productSearch(tbProduct,modelMap);
        return "product/list";
    }

    @ApiOperation("根据商品ID获取商品信息")
    @GetMapping("/getProductById")
    public String getProductById(String productId, ModelMap modelMap){
        productService.getProductById(productId,modelMap);
        return "product/modify";
    }

    @ApiOperation("添加商品")
    @PostMapping("/insertProduct")
    public String insertProduct(TbProduct tbProduct) throws Exception {
        productService.insertProduct(tbProduct);
        return "product/list";
    }

    @ApiOperation("更新商品")
    @PostMapping("/updateProduct")
    public String updateProduct(TbProduct tbProduct) throws Exception {
        productService.updateProduct(tbProduct);
        return "redirect:getProductList";
    }

    @ApiOperation("删除商品")
    @GetMapping("/removeProductById")
    public String removeProductById(String productId) throws Exception {
        productService.removeProductById(productId);
        return "redirect:getProductList";
    }

    @ApiOperation("获取商品分类列表")
    @GetMapping("/getProductCategoryList")
    public String getProductCategoryList(ModelMap modelMap){
        productService.getProductCategoryList(modelMap);
        return "productCategory/list";
    }

    @ApiOperation("根据商品分类ID获取商品信息")
    @GetMapping("/getProductCategoryById")
    public String getProductCategoryById(String productCategoryId, ModelMap modelMap){
        productService.getProductCategoryById(productCategoryId,modelMap);
        return "productCategory/modify";
    }

    @ApiOperation("删除商品")
    @GetMapping("/removeProductCategoryById")
    public String removeProductCategoryById(String productCategoryId) throws Exception {
        productService.removeProductCategoryById(productCategoryId);
        return "redirect:getProductCategoryList";
    }

    @ApiOperation("更新分类商品")
    @PostMapping("/updateProductCategory")
    public String updateProductCategory(TbProductCategory tbProductCategory) throws Exception {
        productService.updateProductCategory(tbProductCategory);
        return "redirect:getProductCategoryList";
    }

    @ApiOperation("添加商品分类")
    @PostMapping("/insertProductCategory")
    public String insertProductCategory(TbProductCategory tbProductCategory) throws Exception {
        productService.insertProductCategory(tbProductCategory);
        return "redirect:getProductCategoryTwoById?productCategoryId=" + tbProductCategory.getParentId();
    }

    @ApiOperation("根据商品分类ID获取商品信息")
    @GetMapping("/getProductCategoryTwoById")
    public String getProductCategoryTwoById(String productCategoryId, ModelMap modelMap){
        productService.getProductCategoryTwoById(productCategoryId,modelMap);
        return "productCategory/listTwo";
    }
}
