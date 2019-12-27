package com.javaliao.homeservice.service.impl;

import com.javaliao.basic.mapper.TbProductCategoryMapper;
import com.javaliao.basic.model.TbProductCategory;
import com.javaliao.basic.model.TbProductCategoryExample;
import com.javaliao.basic.utils.BeanClone;
import com.javaliao.basic.utils.CollectionTool;
import com.javaliao.homeservice.service.ProductSerivce;
import com.javaliao.basic.vo.ProductCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author lzw
 * @Description
 * @Date 13:52 2019/12/26
 * @ClassName ProductServiceImpl
 * @Version 1.0
 **/
@Service
public class ProductServiceImpl implements ProductSerivce {

    @Autowired
    TbProductCategoryMapper tbProductCategoryMapper;

    @Override
    public List<ProductCategoryVo> getProductCategory() {
        //获取一级分类
        TbProductCategoryExample tbProductCategoryExample = new TbProductCategoryExample();
        TbProductCategoryExample.Criteria criteria = tbProductCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(0L);
        List<TbProductCategory> tbProductCategoriesOne = tbProductCategoryMapper.selectByExample(tbProductCategoryExample);
        //类型转换 
        List<ProductCategoryVo> clone = BeanClone.clone(tbProductCategoriesOne, ProductCategoryVo.class);
        if(CollectionTool.isNotEmpty(clone)){
            for (ProductCategoryVo tbProductCategory : clone) {
                //获取二级分类
                Long id = tbProductCategory.getId();
                criteria.andParentIdEqualTo(id);
                List<TbProductCategory> tbProductCategoriesTwo = tbProductCategoryMapper.selectByExample(tbProductCategoryExample);
                tbProductCategory.setProductCategories(tbProductCategoriesTwo);
            }
        }
        return clone;
    }
}
