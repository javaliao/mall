package com.javaliao.homeservice.service;

import com.javaliao.basic.model.TbAdvertisement;
import com.javaliao.basic.model.TbColumn;
import com.javaliao.basic.model.TbSpecialTopic;
import com.javaliao.basic.vo.ProductCategoryVo;

import java.util.List;

/**
 * @Author lzw
 * @Description
 * @Date 13:51 2019/12/26
 * @InterfaceName ProductSerivce
 * @Version 1.0
 **/


public interface ProductSerivce {

    List<ProductCategoryVo> getProductCategory();

    List<TbSpecialTopic> getSpecialTopic();

    List<TbColumn> getColumn();

    List<TbAdvertisement> getAdvertisement();
}
