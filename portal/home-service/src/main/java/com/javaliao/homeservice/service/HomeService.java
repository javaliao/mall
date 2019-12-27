package com.javaliao.homeservice.service;

import com.javaliao.basic.vo.ProductCategoryVo;
import common.CommonResult;
import mapper.TbProductCategoryMapper;
import model.TbProductCategory;
import model.TbProductCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.BeanClone;
import utils.CollectionTool;

import java.util.List;

/**
 * @Author lzw
 * @Description
 * @Date 13:59 2019/12/18
 * @ClassName HomeService
 * @Version 1.0
 **/
@RestController
public class HomeService {

    @Autowired
    TbProductCategoryMapper tbProductCategoryMapper;

    /**
     * @Description :根据父类id查询商品分类信息
     * @Author :USE
     * @Date :14:13 2019/12/18
     * @ClassName :HomeService
     * @MethodName :getProductCategory
     * @param
     * @return :common.CommonResult
     **/
    @RequestMapping(value = "/homeService/getProductCategory",method = RequestMethod.GET)
    public CommonResult getProductCategory(){
        //获取一级分类
        TbProductCategoryExample tbProductCategoryExample = new TbProductCategoryExample();
        tbProductCategoryExample.createCriteria().andParentIdEqualTo(0L);
        List<TbProductCategory> tbProductCategoryListOne = tbProductCategoryMapper.selectByExample(tbProductCategoryExample);
        //自定义实体类转换
        List<ProductCategoryVo> clone = BeanClone.clone(tbProductCategoryListOne, ProductCategoryVo.class);
        if(CollectionTool.isNotEmpty(clone)){
            //遍历一级分类
            for (ProductCategoryVo tbProductCategory : clone) {
                Long id = tbProductCategory.getId();
                tbProductCategoryExample.createCriteria().andParentIdEqualTo(id);
                //根据一级分类id获取二级分类
                List<TbProductCategory> tbProductCategoryListTwo = tbProductCategoryMapper.selectByExample(tbProductCategoryExample);
                if(CollectionTool.isNotEmpty(tbProductCategoryListTwo)){
                    tbProductCategory.setTbProductCategoryListTwo(tbProductCategoryListTwo);
                }
            }
        }
        return CommonResult.success(CommonResult.checkNull(clone));
    }
}
