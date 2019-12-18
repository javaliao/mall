package com.javaliao.backstage.service.impl;

import com.javaliao.backstage.bean.TbProduct;
import com.javaliao.backstage.bean.TbProductCategory;
import com.javaliao.backstage.mapper.ProductCategoryMapper;
import com.javaliao.backstage.mapper.ProductMapper;
import com.javaliao.backstage.service.ProductService;
import com.javaliao.backstage.util.StringTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;
    @Autowired
    ProductCategoryMapper productCategoryMapper;
    @Override
    public void getProductList(ModelMap modelMap) {
        List<TbProduct> tbProducts = productMapper.selectAll();
        modelMap.addAttribute("tbProducts",tbProducts);
    }

    @Override
    public void productSearch(TbProduct tbProduct, ModelMap modelMap) {
        tbProduct.setIsDelete(0L);
        if(StringTool.isEmpty(tbProduct.getProductName())){
            tbProduct.setProductName(null);
        }
        if(StringTool.isEmpty(tbProduct.getProductSn())){
            tbProduct.setProductSn(null);
        }
        if(StringTool.isEmpty(tbProduct.getProductSeller())){
            tbProduct.setProductSeller(null);
        }
        tbProduct.setIsDelete(0L);
        List<TbProduct> tbProducts = productMapper.select(tbProduct);
        modelMap.addAttribute("tbProducts",tbProducts);
    }

    @Override
    public void getProductById(String productId, ModelMap modelMap) {
        TbProduct tbProduct = new TbProduct();
        tbProduct.setId(productId);
        tbProduct.setIsDelete(0L);
        TbProduct tbProductData = productMapper.selectOne(tbProduct);
        modelMap.addAttribute("tbProduct",tbProductData);
    }

    @Override
    public void insertProduct(TbProduct tbProduct) throws Exception {
        int insert = productMapper.insert(tbProduct);
        if(insert <= 0){
            throw new Exception("添加失败！");
        }
    }

    @Override
    public void updateProduct(TbProduct tbProduct) throws Exception {
        int i = productMapper.updateByPrimaryKey(tbProduct);
        if(i <= 0){
            throw new Exception("更新失败！");
        }
    }

    @Override
    public void removeProductById(String productId) throws Exception {
        TbProduct tbProduct = new TbProduct();
        tbProduct.setId(productId);
        int delete = productMapper.delete(tbProduct);
        if(delete <= 0){
            throw new Exception("删除失败！");
        }
    }

    @Override
    public void getProductCategoryList(ModelMap modelMap) {
        TbProductCategory tbProductCategory = new TbProductCategory();
        tbProductCategory.setIsDelete(0L);
        tbProductCategory.setParentId("0");
        List<TbProductCategory> tbProductCategories = productCategoryMapper.select(tbProductCategory);
        modelMap.addAttribute("tbProductCategories",tbProductCategories);
    }

    @Override
    public void getProductCategoryById(String productCategoryId, ModelMap modelMap) {
        TbProductCategory tbProductCategory = new TbProductCategory();
        tbProductCategory.setId(productCategoryId);
        tbProductCategory.setIsDelete(0L);
        TbProductCategory tbProductCategoryData = productCategoryMapper.selectOne(tbProductCategory);
        modelMap.addAttribute("tbProductCategory",tbProductCategoryData);
    }

    @Override
    public void removeProductCategoryById(String productCategoryId) throws Exception {
        TbProductCategory tbProductCategory = new TbProductCategory();
        tbProductCategory.setId(productCategoryId);
        int delete = productCategoryMapper.delete(tbProductCategory);
        if(delete <= 0){
            throw new Exception("删除失败！");
        }
    }

    @Override
    public void updateProductCategory(TbProductCategory tbProductCategory) throws Exception {
        int i = productCategoryMapper.updateByPrimaryKey(tbProductCategory);
        if(i <= 0){
            throw new Exception("更新失败！");
        }
    }

    @Override
    public void insertProductCategory(TbProductCategory tbProductCategory) throws Exception {
        if(StringTool.isEmpty(tbProductCategory.getId())){
            tbProductCategory.setId(null);
        }
        tbProductCategory.setIsDelete(0L);
        int insert = productCategoryMapper.insert(tbProductCategory);
        if(insert <= 0){
            throw new Exception("添加失败！");
        }
    }

    @Override
    public void getProductCategoryTwoById(String productCategoryId, ModelMap modelMap) {
        TbProductCategory tbProductCategory = new TbProductCategory();
        tbProductCategory.setParentId(productCategoryId);
        tbProductCategory.setIsDelete(0L);
        List<TbProductCategory> tbProductCategorysData = productCategoryMapper.select(tbProductCategory);
        modelMap.addAttribute("tbProductCategories",tbProductCategorysData);
        modelMap.addAttribute("parentId",productCategoryId);
    }

    @Override
    public void insertProductList(List<TbProduct> list) {
        //try放在for循环的里面所有的for循环都会执行，当遇到异常时，抛出异常继续执行；
        //放在外面，当遇到异常时，抛出异常，后面的循环就会终止，并不会执行。
        try{
            if(!CollectionUtils.isEmpty(list)){
                for (TbProduct tbProduct : list) {
                    productMapper.insertSelective(tbProduct);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
