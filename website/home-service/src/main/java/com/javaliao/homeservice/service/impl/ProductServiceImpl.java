package com.javaliao.homeservice.service.impl;

import com.javaliao.basic.mapper.TbAdvertisementMapper;
import com.javaliao.basic.mapper.TbColumnMapper;
import com.javaliao.basic.mapper.TbProductCategoryMapper;
import com.javaliao.basic.mapper.TbSpecialTopicMapper;
import com.javaliao.basic.model.*;
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

    @Autowired
    TbSpecialTopicMapper tbSpecialTopicMapper;

    @Autowired
    TbColumnMapper tbColumnMapper;

    @Autowired
    TbAdvertisementMapper tbAdvertisementMapper;

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

    @Override
    public List<TbSpecialTopic> getSpecialTopic() {
        return tbSpecialTopicMapper.selectByExample(new TbSpecialTopicExample());
    }

    @Override
    public List<TbColumn> getColumn() {
        return tbColumnMapper.selectByExample(new TbColumnExample());
    }

    @Override
    public List<TbAdvertisement> getAdvertisement() {
        return tbAdvertisementMapper.selectByExample(new TbAdvertisementExample());
    }
}
