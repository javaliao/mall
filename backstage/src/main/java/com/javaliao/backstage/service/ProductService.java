package com.javaliao.backstage.service;

import com.javaliao.backstage.bean.TbProduct;
import com.javaliao.backstage.bean.TbProductCategory;
import org.springframework.ui.ModelMap;

import java.util.List;

public interface ProductService {

    void getProductList(ModelMap modelMap);

    void productSearch(TbProduct tbProduct, ModelMap modelMap);

    void getProductById(String productId, ModelMap modelMap);

    void insertProduct(TbProduct tbProduct) throws Exception;

    void updateProduct(TbProduct tbProduct) throws Exception;

    void removeProductById(String productId) throws Exception;

    void getProductCategoryList(ModelMap modelMap);

    void getProductCategoryById(String productCategoryId, ModelMap modelMap);

    void removeProductCategoryById(String productCategoryId) throws Exception;

    void updateProductCategory(TbProductCategory tbProductCategory) throws Exception;

    void insertProductCategory(TbProductCategory tbProductCategory) throws Exception;

    void getProductCategoryTwoById(String productCategoryId, ModelMap modelMap);

    void insertProductList(List<TbProduct> list);
}
