package com.javaliao.backstage.controller;

import com.javaliao.backstage.bean.TbProduct;
import com.javaliao.backstage.bean.TbProductCategory;
import com.javaliao.backstage.mapper.ProductCategoryMapper;
import com.javaliao.backstage.mapper.ProductMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/productController")
@Api(tags = "ProductController",description = "商品管理")
public class ProductController extends BaseController{

    @Autowired
    ProductMapper productMapper;
    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @ApiOperation("获取商品列表")
    @GetMapping("/getProductList")
    public String getProductList(ModelMap modelMap){
        List<TbProduct> tbProducts = productMapper.selectAll();
        modelMap.addAttribute("tbProducts",tbProducts);
        return "product/list";
    }

    @ApiOperation("根据商品ID获取商品信息")
    @GetMapping("/getProductById")
    public String getProductById(String productId, ModelMap modelMap){
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
    @GetMapping("/removeProductById")
    public String removeProductById(String productId) throws Exception {
        TbProduct tbProduct = new TbProduct();
        tbProduct.setId(productId);
        int delete = productMapper.delete(tbProduct);
        if(delete <= 0){
            throw new Exception("删除失败！");
        }
        return "redirect:getProductList";
    }

    @ApiOperation("获取商品分类列表")
    @GetMapping("/getProductCategoryList")
    public String getProductCategoryList(ModelMap modelMap){
        TbProductCategory tbProductCategory = new TbProductCategory();
        tbProductCategory.setIsDelete(0L);
        List<TbProductCategory> tbProductCategories = productCategoryMapper.select(tbProductCategory);
        modelMap.addAttribute("tbProductCategories",tbProductCategories);
        return "productCategory/list";
    }

    @ApiOperation("根据商品分类ID获取商品信息")
    @GetMapping("/getProductCategoryById")
    public String getProductCategoryById(String productCategoryId, ModelMap modelMap){
        TbProductCategory tbProductCategory = new TbProductCategory();
        tbProductCategory.setId(productCategoryId);
        TbProductCategory tbProductCategoryData = productCategoryMapper.selectOne(tbProductCategory);
        modelMap.addAttribute("tbProductCategory",tbProductCategoryData);
        return "productCategory/modify";
    }

    @ApiOperation("删除商品")
    @GetMapping("/removeProductCategoryById")
    public String removeProductCategoryById(String productCategoryId) throws Exception {
        TbProductCategory tbProductCategory = new TbProductCategory();
        tbProductCategory.setId(productCategoryId);
        int delete = productCategoryMapper.delete(tbProductCategory);
        if(delete <= 0){
            throw new Exception("删除失败！");
        }
        return "redirect:getProductCategoryList";
    }

    @ApiOperation("更新分类商品")
    @PostMapping("/updateProductCategory")
    public String updateProductCategory(TbProductCategory tbProductCategory) throws Exception {
        int i = productCategoryMapper.updateByPrimaryKey(tbProductCategory);
        if(i <= 0){
            throw new Exception("更新失败！");
        }
        return "redirect:getProductCategoryList";
    }

    @ApiOperation("添加商品")
    @PostMapping("/insertProductCategory")
    public String insertProductCategory(TbProductCategory tbProductCategory) throws Exception {
        tbProductCategory.setIsDelete(0l);
        int insert = productCategoryMapper.insert(tbProductCategory);
        if(insert <= 0){
            throw new Exception("添加失败！");
        }
        return "redirect:getProductCategoryList";
    }

    @ApiOperation("根据商品分类ID获取商品信息")
    @GetMapping("/getProductCategoryTwoById")
    public String getProductCategoryTwoById(String productCategoryId, ModelMap modelMap){
        TbProductCategory tbProductCategory = new TbProductCategory();
        tbProductCategory.setParentId(productCategoryId);
        tbProductCategory.setIsDelete(0L);
        List<TbProductCategory> tbProductCategorysData = productCategoryMapper.select(tbProductCategory);
        modelMap.addAttribute("tbProductCategories",tbProductCategorysData);
        return "productCategory/list";
    }
}
