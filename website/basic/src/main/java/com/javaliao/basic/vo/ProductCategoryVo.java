package com.javaliao.basic.vo;

import com.javaliao.basic.model.TbProductCategory;
import java.util.List;

/**
 * @Author lzw
 * @Description
 * @Date 11:12 2019/12/26
 * @ClassName ProductCategoryVo
 * @Version 1.0
 **/

public class ProductCategoryVo extends TbProductCategory {

    private List<TbProductCategory> productCategories;

    public List<TbProductCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<TbProductCategory> productCategories) {
        this.productCategories = productCategories;
    }
}
