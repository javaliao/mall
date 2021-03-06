package com.javaliao.homeweb.feign;

import com.javaliao.basic.model.TbAdvertisement;
import com.javaliao.basic.model.TbColumn;
import com.javaliao.basic.model.TbSpecialTopic;
import com.javaliao.basic.vo.ProductCategoryVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author lzw
 * @Description
 * @Date 16:55 2019/12/24
 * @InterfaceName HomeFeign
 * @Version 1.0
 **/

@FeignClient(value = "home-service")
public interface HomeFeign {

    /**
     * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
     * 注意：两个坑：1. @GetMapping不支持   2. @PathVariable和@RequestParam得设置value
     */

    @RequestMapping(value = "/productController/getProductCategory",method = RequestMethod.GET)
    List<ProductCategoryVo> getProductCategory();

    @RequestMapping(value = "/productController/getSpecialTopic",method = RequestMethod.GET)
    List<TbSpecialTopic> getSpecialTopic();

    @RequestMapping(value = "/productController/getColumn",method = RequestMethod.GET)
    List<TbColumn> getColumn();

    @RequestMapping(value = "/productController/getAdvertisement",method = RequestMethod.GET)
    List<TbAdvertisement> getAdvertisement();
}
