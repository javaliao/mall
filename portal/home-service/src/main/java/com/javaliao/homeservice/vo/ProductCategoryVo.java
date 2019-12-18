package com.javaliao.homeservice.vo;

import lombok.Data;
import model.TbProductCategory;

import java.util.List;

/**
 * @Author lzw
 * @Description
 * @Date 14:19 2019/12/18
 * @ClassName ProductCategoryVo
 * @Version 1.0
 **/
@Data
public class ProductCategoryVo extends TbProductCategory {

    List<TbProductCategory> tbProductCategoryListTwo;
}
